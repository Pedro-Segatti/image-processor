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
    }, SUBTRACT {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 - value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
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
    }, MULTIPLICATION {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return value1 * value2;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }, AND {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            boolean v1 = value1 > 0;
            boolean v2 = value2 > 0;
            return (v1 && v2) ? 255 : 0;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
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
    }, NEGATIVE {
        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            return 255 - value1;
        }

        @Override
        public int getResult(Integer[][] focus, int bounds) {
            throw new UnsupportedOperationException("Not supported yet.");
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
    }, MEDIA {
        @Override
        public int getResult(Integer[][] focus, int bounds) {
            int width = focus.length;
            int height = focus[0].length;
            int sumValue = 0;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Integer valorFoco = focus[x][y];
                    if (valorFoco == null) {
                        valorFoco = 0;
                    }
                    sumValue += valorFoco;
                }
            }

            return sumValue / (bounds);
        }

        @Override
        public Integer getResult(Integer value1, Integer value2, Integer coeficient) {
            throw new UnsupportedOperationException("Not supported yet.");
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
    };

    public abstract Integer getResult(Integer value1, Integer value2, Integer coeficient);

    public abstract int getResult(Integer[][] focus, int bounds);
}
