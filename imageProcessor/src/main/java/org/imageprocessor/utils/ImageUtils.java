package org.imageprocessor.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.imageprocessor.models.Image;

/**
 *
 * @author Pedro
 */
public class ImageUtils {

    public static Image loadImage() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png", "bmp", "tiff", "tif");

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage img = ImageIO.read(selectedFile);
                Image image = new Image(img);
                return image;
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static int[][] rgbToBinary(int[][] red, int[][] green, int[][] blue, int limit) {
        int width = red.length;
        int height = red[0].length;

        int[][] binaryMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int valorFinal;
                int valMatrizR = red[x][y];
                int valMatrizG = green[x][y];
                int valMatrizB = blue[x][y];
                valorFinal = (valMatrizR + valMatrizG + valMatrizB) / 3;
                valorFinal = getValueInBounds(valorFinal);
                if (valorFinal >= limit) {
                    valorFinal = 0;
                } else {
                    valorFinal = 1;
                }
                binaryMatrix[x][y] = valorFinal;
            }
        }
        return binaryMatrix;
    }

    public static int[][] rgbToGray(int[][] red, int[][] green, int[][] blue) {
        int width = red.length;
        int height = red[0].length;

        int[][] grayMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int valorFinal;
                int valMatrizR = red[x][y];
                int valMatrizG = green[x][y];
                int valMatrizB = blue[x][y];
                valorFinal = (valMatrizR + valMatrizG + valMatrizB) / 3;
                valorFinal = getValueInBounds(valorFinal);
                grayMatrix[x][y] = valorFinal;
            }
        }
        return grayMatrix;
    }

    public static BufferedImage getGrayImage(int[][] grayMatrix) {
        int width = grayMatrix.length;
        int height = grayMatrix[0].length;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int grayValue = grayMatrix[x][y];
                int rgbValue = (grayValue << 16) | (grayValue << 8) | grayValue;
                image.setRGB(x, y, rgbValue);
            }
        }
        return image;
    }

    public static int getValueInBounds(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 255) {
            return 255;
        }
        return value;
    }

    public static int getMaxValue(int value1, int value2) {
        return Math.max(value1, value2);
    }

    public static int getMinValue(int value1, int value2) {
        return Math.min(value1, value2);
    }

    public static Image applyFilterInImage(Image image, int bounds, Operation operation, int position) {
        Image imageResult = new Image();
        imageResult.setRed(filterSingleMatrix(image.getRed(), bounds, operation, position));
        imageResult.setGreen(filterSingleMatrix(image.getGreen(), bounds, operation, position));
        imageResult.setBlue(filterSingleMatrix(image.getBlue(), bounds, operation, position));
        return imageResult;
    }

    public static Image applyFilterInImage(Image image, int bounds, Operation operation) {
        Image imageResult = new Image();
        imageResult.setRed(filterSingleMatrix(image.getRed(), bounds, operation));
        imageResult.setGreen(filterSingleMatrix(image.getGreen(), bounds, operation));
        imageResult.setBlue(filterSingleMatrix(image.getBlue(), bounds, operation));
        return imageResult;
    }

    private static int[][] filterSingleMatrix(int[][] matrix, Integer bounds, Operation operation) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] filteredMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Integer[][] focus = getFocus(matrix, bounds, x, y);
                filteredMatrix[x][y] = operation.getResult(focus, bounds);
            }
        }

        return filteredMatrix;
    }

    private static int[][] filterSingleMatrix(int[][] matrix, Integer bounds, Operation operation, int position) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] filteredMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Integer[][] focus = getFocus(matrix, bounds, x, y);
                filteredMatrix[x][y] = operation.getResult(focus, bounds, position);
            }
        }

        return filteredMatrix;
    }

    private static Integer[][] getFocus(int[][] matrix, Integer bounds, int posX, int posY) {
        Integer[][] focus = new Integer[bounds][bounds];

        for (int y = 0; y < bounds; y++) {
            for (int x = 0; x < bounds; x++) {
                int posFocusX = posX + (x - bounds);
                int posFocusY = posY + (y - bounds);
                if (isPositionValid(matrix, posFocusX, posFocusY)) {
                    focus[x][y] = matrix[posFocusX][posFocusY];
                }
            }
        }
        return focus;
    }

    private static boolean isPositionValid(int[][] matrix, int posX, int posY) {
        int width = matrix.length;
        int height = matrix[0].length;

        return posX >= 0 && posX < width && posY >= 0 && posY < height;
    }

    public static Image doOperationInImages(Image image1, Image image2, Integer coeficient, Operation operation) {
        Image imageResult = new Image();
        imageResult.setRed(operationInTwoMatrixes(image1.getRed(), image2.getRed(), coeficient, operation));
        imageResult.setGreen(operationInTwoMatrixes(image1.getGreen(), image2.getGreen(), coeficient, operation));
        imageResult.setBlue(operationInTwoMatrixes(image1.getBlue(), image2.getBlue(), coeficient, operation));
        imageResult.setAlpha(operationInTwoMatrixes(image1.getAlpha(), image2.getAlpha(), coeficient, operation));
        return imageResult;
    }

    public static Image doOperationInImage(Image image, Integer value, Integer coeficient, Operation operation) {
        Image imageResult = new Image();
        imageResult.setRed(operationSingleMatrix(image.getRed(), value, coeficient, operation));
        imageResult.setGreen(operationSingleMatrix(image.getGreen(), value, coeficient, operation));
        imageResult.setBlue(operationSingleMatrix(image.getBlue(), value, coeficient, operation));
        return imageResult;
    }

    public static int[][] operationInTwoMatrixes(int[][] matrix1, int[][] matrix2, Integer coeficient, Operation operation) {
        int maxWidth = getMaxValue(matrix1.length, matrix2.length);
        int minWidth = getMinValue(matrix1.length, matrix2.length);
        int maxHeight = getMaxValue(matrix1[0].length, matrix2[0].length);
        int minHeight = getMinValue(matrix1[0].length, matrix2[0].length);
        int[][] result = new int[maxWidth][maxHeight];
        int[][] widerMatrix;
        int[][] tallerMatrix;
        if (matrix1.length > matrix2.length) {
            widerMatrix = matrix1;
        } else {
            widerMatrix = matrix2;
        }
        if (matrix1[0].length > matrix2[0].length) {
            tallerMatrix = matrix1;
        } else {
            tallerMatrix = matrix2;
        }

        for (int y = 0; y < minHeight; y++) {
            for (int x = 0; x < minWidth; x++) {
                int opResult;
                opResult = operation.getResult(matrix1[x][y], matrix2[x][y], coeficient);
                result[x][y] = getValueInBounds(opResult);
            }
            for (int x1 = minWidth; x1 < maxWidth; x1++) {
                result[x1][y] = widerMatrix[x1][y];
            }
        }
        for (int y1 = minHeight; y1 < maxHeight; y1++) {
            for (int x = 0; x < tallerMatrix.length; x++) {
                result[x][y1] = tallerMatrix[x][y1];
            }
        }
        return result;
    }

    private static int[][] operationSingleMatrix(int[][] matrix, Integer value, Integer coeficient, Operation operation) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] result = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[x][y] = getValueInBounds(operation.getResult(matrix[x][y], value, coeficient));
            }
        }
        return result;
    }
}
