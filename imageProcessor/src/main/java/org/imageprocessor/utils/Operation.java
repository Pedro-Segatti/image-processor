package org.imageprocessor.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pedro
 */
public enum Operation {

    SUM {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 + value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, SUBTRACT {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 - value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, DIVISION {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            if (value2 == 0) {
                return value1;
            }
            return value1 / value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, MULTIPLICATION {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 * value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, AND {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 + value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, OR {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            boolean v1 = value1 > 0;
            boolean v2 = value2 > 0;
            return (v1 || v2) ? 255 : 0;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, XOR {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            boolean v1 = value1 > 0;
            boolean v2 = value2 > 0;
            return (v1 ^ v2) ? 255 : 0;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, NOT {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            if (value1 == 255) {
                return 0;
            }
            return 255;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, BLENDING {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            double coeficientResult = coeficient / 100.0;
            double result = coeficientResult * value1 + (1 - coeficientResult) * value2;
            return (int) Math.round(result);
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, NEGATIVE {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return 255 - value1;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, MAX {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int width = focus.length;
            int height = focus[0].length;
            int maxValue = 0;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (focus[x][y] != null && focus[x][y] > maxValue) {
                        maxValue = focus[x][y];
                    }
                }
            }

            return maxValue;
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, MIN {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int width = focus.length;
            int height = focus[0].length;
            Integer minValue = null;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Integer valorFoco = focus[x][y];
                    if (valorFoco == null) {
                        valorFoco = 0;
                    }
                    if (minValue == null || valorFoco < minValue) {
                        minValue = valorFoco;
                    }
                }
            }

            return minValue;
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, MEDIA {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int width = focus.length;
            int height = focus[0].length;
            int sumValue = 0;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Integer valorFoco = focus[x][y];
                    if (valorFoco != null) {
                        sumValue += valorFoco;
                    }
                }
            }

            return sumValue / (bounds);
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, MEDIANA {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int width = focus.length;
            int height = focus[0].length;
            List<Integer> valores = new ArrayList<>();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Integer valorFoco = focus[x][y];
                    if (valorFoco == null) {
                        valorFoco = 0;
                    }
                    valores.add(valorFoco);
                }
            }

            Collections.sort(valores);

            double mediana;
            int tamanho = valores.size();

            if (tamanho % 2 == 0) {
                int meio1 = valores.get(tamanho / 2 - 1);
                int meio2 = valores.get(tamanho / 2);
                mediana = (meio1 + meio2) / 2.0; // Usamos 2.0 para garantir uma divisão decimal
            } else {
                mediana = valores.get(tamanho / 2);
            }

            return (int) mediana;
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, ORDER {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            int width = focus.length;
            int height = focus[0].length;
            List<Integer> valores = new ArrayList<>();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Integer valorFoco = focus[x][y];
                    if (valorFoco == null) {
                        valorFoco = 0;
                    }
                    valores.add(valorFoco);
                }
            }

            Collections.sort(valores);

            return valores.get(position);
        }
    }, CONSERVATIVE_SUAVIZATION {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            int intensitySum = 0;
            int weightSum = 0;
            int width = focus.length;
            int height = focus[0].length;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Integer valorFoco = focus[x][y];
                    if (valorFoco == null) {
                        continue;
                    }
                    int distance = (y * y + x * x);
                    double weight = Math.exp(-distance / (2 * position * position));
                    intensitySum += valorFoco * weight;
                    weightSum += weight;
                }
            }

            int resultIntensity = (int) (intensitySum / weightSum);
            return resultIntensity;
        }
    }, BORDER_WITH_SOBEL {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int[][] sobelX = {{-1, 0, 1}, {-2, 0, 2}, {-1, 0, 1}};
            int[][] sobelY = {{-1, -2, -1}, {0, 0, 0}, {1, 2, 1}};

            int sumX = 0;
            int sumY = 0;
            int width = focus.length;
            int height = focus[0].length;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int imageX = x + j;
                            int imageY = y + i;

                            if (imageX >= 0 && imageX < width && imageY >= 0 && imageY < height) {
                                Integer valorFoco = focus[imageY][imageX];
                                if (valorFoco == null) {
                                    continue;
                                }
                                sumX += valorFoco * sobelX[i + 1][j + 1];
                                sumY += valorFoco * sobelY[i + 1][j + 1];
                            }
                        }
                    }
                }
            }

            int magnitude = (int) Math.sqrt(sumX * sumX + sumY * sumY);

            return magnitude;
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }, BORDER_WITH_PREWITT {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int[][] prewittX = {{-1, 0, 1}, {-1, 0, 1}, {-1, 0, 1}};
            int[][] prewittY = {{-1, -1, -1}, {0, 0, 0}, {1, 1, 1}};

            int sumX = 0;
            int sumY = 0;
            int width = focus.length;
            int height = focus[0].length;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int imageX = x + j;
                            int imageY = y + i;

                            if (imageX >= 0 && imageX < width && imageY >= 0 && imageY < height) {
                                Integer valorFoco = focus[imageY][imageX];
                                if (valorFoco == null) {
                                    continue;
                                }
                                sumX += valorFoco * prewittX[i + 1][j + 1];
                                sumY += valorFoco * prewittY[i + 1][j + 1];
                            }
                        }
                    }
                }
            }

            int magnitude = (int) Math.sqrt(sumX * sumX + sumY * sumY);

            return magnitude;
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }, BORDER_WITH_LAPLACIAN {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int[][] laplacianMask = {{0, 1, 0}, {1, -4, 1}, {0, 1, 0}};

            int sum = 0;
            int width = focus.length;
            int height = focus[0].length;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int imageX = x + j;
                            int imageY = y + i;

                            if (imageX >= 0 && imageX < width && imageY >= 0 && imageY < height) {
                                Integer valorFoco = focus[imageY][imageX];
                                if (valorFoco == null) {
                                    continue;
                                }
                                sum += valorFoco * laplacianMask[i + 1][j + 1];
                            }
                        }
                    }
                }
            }

            return sum;
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getResult(Integer[][] focus, int bounds, int position) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };

    public abstract Integer getResult(Integer value1, Integer value2, Integer coeficient);

    public abstract int getResult(Integer[][] focus, int bounds);

    public abstract int getResult(Integer[][] focus, int bounds, int position);
}
