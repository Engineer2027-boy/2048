import java.util.Random;
import java.util.Scanner;
public class twothousandfortyeight {
    public static int[][] showboard() {
        int[][] x = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Random random = new Random();
        int x_axis_1 = 0, x_axis_2 = 0;
        int y_axis_1 = 0, y_axis_2 = 0;
        while (x_axis_1 == x_axis_2 && y_axis_1 == y_axis_2) {
            x_axis_1 = random.nextInt(4);
            y_axis_1 = random.nextInt(4);
            x_axis_2 = random.nextInt(4);
            y_axis_2 = random.nextInt(4);
        }
        x[x_axis_1][y_axis_1] = 2;
        x[x_axis_2][y_axis_2] = 2;
        return x;
    }

    public static int[][] moveStuff(int[][] x) {
	int[][] newArray = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newArray[i][j] = x[i][j];
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write -1 for moving leftwards or 1 for rightwards, 2 for upwards - 2 for downwards  :  ");
        int userInput = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (x[i][j] == 2) {
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 2) {
                                if (k == 0) {
                                    x[i][k] = 4;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 4;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if (x[i][l] != 0) {
                                    x[i][l + 1] = 2;
                                } else {
                                    x[i][l] = 2;
                                }

                            }
                        }

                    } else if (userInput == 1) {
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 2) {
                                if (k == 3) {
                                    x[i][k] = 4;

                                } else {
                                    while (k < 3 && x[i][k + 1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 4;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[i][l] != 0) {
                                    x[i][l - 1] = 2;
                                } else {
                                    x[i][l] = 2;
                                }

                            }
                        }

                    } else if (userInput == 2) {
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 2) {
                                if (k == 0) {
                                    x[k][j] = 4;
                                } else {
                                    while (k > 1 && x[k - 1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 4;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0 && x[l][j] == 0) {
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l + 1][j] = 2;
                                } else {
                                    x[l][j] = 2;
                                }

                            }
                        }

                    } else if (userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 2) {
                                if (k == 3) {
                                    x[k][j] = 4;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 4;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 2;
                                } else {
                                    x[l][j] = 2;
                                }

                            }
                        }

                    }
                }
                if (x[i][j] == 4) {
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 4) {
                                if (k == 0) {
                                    x[i][k] = 8;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 8;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if (x[i][l] != 0) {
                                    x[i][l + 1] = 4;
                                } else {
                                    x[i][l] = 4;
                                }

                            }
                        }

                    } else if (userInput == 1) {
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 4) {
                                if (k == 3) {
                                    x[i][k] = 8;

                                } else {
                                    while (k < 3 && x[i][k + 1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 8;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[i][l] != 0) {
                                    x[i][l - 1] = 4;
                                } else {
                                    x[i][l] = 4;
                                }

                            }
                        }

                    } else if (userInput == 2) {
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 4) {
                                if (k == 0) {
                                    x[k][j] = 8;
                                } else {
                                    while (k > 1 && x[k - 1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 8;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0 && x[l][j] == 0) {
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l + 1][j] = 4;
                                } else {
                                    x[l][j] = 4;
                                }

                            }
                        }

                    } else if (userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 4) {
                                if (k == 3) {
                                    x[k][j] = 8;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 8;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 4;
                                } else {
                                    x[l][j] = 4;
                                }

                            }
                        }


                    }
                }
                if(x[i][j] == 8){
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 8) {
                                if (k == 0) {
                                    x[i][k] = 16;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 16;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 8;
                                }else{
                                    x[i][l] = 8;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 8) {
                                if (k == 3) {
                                    x[i][k] = 16;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 16;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 8;
                                }else{
                                    x[i][l] = 8;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 8) {
                                if (k == 0) {
                                    x[k][j] = 16;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 16;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 8;
                                }else{
                                    x[l][j] = 8;
                                }

                            }
                        }

                    }else if(userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 8) {
                                if (k == 3) {
                                    x[k][j] = 16;
                                } else {
                                    while (k < 3 && x[k+1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 16;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 8;
                                } else {
                                    x[l][j] = 8;
                                }

                            }
                        }

                    }
                    }
                if(x[i][j] == 16) {
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 16) {
                                if (k == 0) {
                                    x[i][k] = 32;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 32;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 16;
                                }else{
                                    x[i][l] = 16;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 16) {
                                if (k == 3) {
                                    x[i][k] = 32;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 32;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 16;
                                }else{
                                    x[i][l] = 16;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 16) {
                                if (k == 0) {
                                    x[k][j] = 32;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 32;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 16;
                                }else{
                                    x[l][j] = 16;
                                }

                            }
                        }

                    }else if(userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 16) {
                                if (k == 3) {
                                    x[k][j] = 32;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 32;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 16;
                                } else {
                                    x[l][j] = 16;
                                }

                            }
                        }

                    }
                    }if(x[i][j] == 32) {
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 32) {
                                if (k == 0) {
                                    x[i][k] = 64;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 64;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 32;
                                }else{
                                    x[i][l] = 32;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 32) {
                                if (k == 3) {
                                    x[i][k] = 64;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 64;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 32;
                                }else{
                                    x[i][l] = 32;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 32) {
                                if (k == 0) {
                                    x[k][j] = 64;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 64;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 32;
                                }else{
                                    x[l][j] = 32;
                                }

                            }
                        }

                    }else if(userInput == -2){
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 32) {
                                if (k == 3) {
                                    x[k][j] = 64;
                                } else {
                                    while (k < 3 && x[k+1][j] == 0){
                                        k = k + 1;
                                    }
                                    x[k][j] = 64;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l-1][j] = 32;
                                }else{
                                    x[l][j] = 32;
                                }

                            }
                        }



                    }
                }if(x[i][j] == 64){
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 64) {
                                if (k == 0) {
                                    x[i][k] = 128;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 128;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 64;
                                }else{
                                    x[i][l] = 64;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 64) {
                                if (k == 3) {
                                    x[i][k] = 128;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 128;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 64;
                                }else{
                                    x[i][l] = 64;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 64) {
                                if (k == 0) {
                                    x[k][j] = 128;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 128;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 64;
                                }else{
                                    x[l][j] = 64;
                                }

                            }
                        }

                    }else if(userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 64) {
                                if (k == 3) {
                                    x[k][j] = 128;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 128;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 64;
                                } else {
                                    x[l][j] = 64;
                                }

                            }
                        }

                    }
                    }
                if(x[i][j] == 128) {
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 128) {
                                if (k == 0) {
                                    x[i][k] = 256;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 256;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if (x[i][l] != 0) {
                                    x[i][l + 1] = 128;
                                } else {
                                    x[i][l] = 128;
                                }

                            }
                        }

                    } else if (userInput == 1) {
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 128) {
                                if (k == 3) {
                                    x[i][k] = 256;

                                } else {
                                    while (k < 3 && x[i][k + 1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 256;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[i][l] != 0) {
                                    x[i][l - 1] = 128;
                                } else {
                                    x[i][l] = 128;
                                }

                            }
                        }

                    } else if (userInput == 2) {
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 128) {
                                if (k == 0) {
                                    x[k][j] = 256;
                                } else {
                                    while (k > 1 && x[k - 1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 256;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0 && x[l][j] == 0) {
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l + 1][j] = 128;
                                } else {
                                    x[l][j] = 128;
                                }

                            }
                        }

                    } else if (userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 128) {
                                if (k == 3) {
                                    x[k][j] = 256;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 256;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 128;
                                } else {
                                    x[l][j] = 128;
                                }

                            }
                        }


                    }
                }
                if(x[i][j] == 256){
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 256) {
                                if (k == 0) {
                                    x[i][k] = 512;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 512;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 256;
                                }else{
                                    x[i][l] = 256;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 256) {
                                if (k == 3) {
                                    x[i][k] = 512;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 512;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 256;
                                }else{
                                    x[i][l] = 256;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 256) {
                                if (k == 0) {
                                    x[k][j] = 512;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 512;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 256;
                                }else{
                                    x[l][j] = 256;
                                }

                            }
                        }

                    }else if(userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 256) {
                                if (k == 3) {
                                    x[k][j] = 512;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 512;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 256;
                                } else {
                                    x[l][j] = 256;
                                }

                            }
                        }

                    }
                    }
                if(x[i][j] == 512){
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 512) {
                                if (k == 0) {
                                    x[i][k] = 1024;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 1024;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 512;
                                }else{
                                    x[i][l] = 512;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 512) {
                                if (k == 3) {
                                    x[i][k] = 1024;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 1024;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 512;
                                }else{
                                    x[i][l] = 512;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 512) {
                                if (k == 0) {
                                    x[k][j] = 1024;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 1024;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 512;
                                }else{
                                    x[l][j] = 512;
                                }

                            }
                        }

                    }else if(userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 512) {
                                if (k == 3) {
                                    x[k][j] = 1024;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 1024;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 512;
                                } else {
                                    x[l][j] = 512;
                                }

                            }
                        }

                    }
                }
                if(x[i][j] == 1024){
                    if (userInput == -1) {
                        boolean has_been_multiplied = false;
                        for (int k = j - 1; k >= 0; k--) {
                            if (x[i][k] == 1024) {
                                if (k == 0) {
                                    x[i][k] = 2048;
                                } else {
                                    while (k > 1 && x[i][k - 1] == 0) {
                                        k = k - 1;
                                    }
                                    x[i][k] = 2048;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j > 0) {
                                int l = j - 1;

                                while (l > 0 && x[i][l] == 0) {
                                    l = l - 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l+1] = 1024;
                                }else{
                                    x[i][l] = 1024;
                                }

                            }
                        }

                    }else if(userInput == 1){
                        boolean has_been_multiplied = false;
                        for (int k = j + 1; k <= 3; k++) {
                            if (x[i][k] == 1024) {
                                if (k == 3) {
                                    x[i][k] = 2048;

                                } else {
                                    while (k < 3 && x[i][k+1] == 0) {
                                        k = k + 1;
                                    }
                                    x[i][k] = 2048;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (j < 3) {
                                int l = j + 1;

                                while (l < 3 && x[i][l] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if(x[i][l] != 0) {
                                    x[i][l-1] = 1024;
                                }else{
                                    x[i][l] = 1024;
                                }

                            }
                        }

                    }else if(userInput == 2){
                        boolean has_been_multiplied = false;
                        for (int k = i - 1; k >= 0; k--) {
                            if (x[k][j] == 1024) {
                                if (k == 0) {
                                    x[k][j] = 2048;
                                } else {
                                    while (k > 1 && x[k-1][j] == 0) {
                                        k = k - 1;
                                    }
                                    x[k][j] = 2048;
                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i > 0) {
                                int l = i - 1;

                                while (l > 0  && x[l][j] == 0){
                                    l = l - 1;
                                }

                                x[i][j] = 0;
                                if(x[l][j] != 0) {
                                    x[l+1][j] = 1024;
                                }else{
                                    x[l][j] = 1024;
                                }

                            }
                        }

                    }else if(userInput == -2) {
                        boolean has_been_multiplied = false;
                        for (int k = i + 1; k <= 3; k++) {
                            if (x[k][j] == 1024) {
                                if (k == 3) {
                                    x[k][j] = 2048;
                                } else {
                                    while (k < 3 && x[k + 1][j] == 0) {
                                        k = k + 1;
                                    }
                                    x[k][j] = 2048;

                                }
                                x[i][j] = 0;
                                has_been_multiplied = true;
                                break;
                            }
                        }
                        if (!has_been_multiplied) {
                            if (i < 3) {
                                int l = i + 1;

                                while (l < 3 && x[l][j] == 0) {
                                    l = l + 1;
                                }
                                x[i][j] = 0;
                                if (x[l][j] != 0) {
                                    x[l - 1][j] = 1024;
                                } else {
                                    x[l][j] = 1024;
                                }

                            }
                        }

                    }

                }
            }
        }
	boolean isEqual = Arrays.deepEquals(x, newArray);
        if(!isEqual) {
            make_a_new_two_show_up(x);
        }
        return x;
    }public static boolean is_the_list_filled(int[][] x){
        int i = 0;
        for(int[] y : x){
            for(int z : y){
                if(z == 0){
                    i += 1;
                }
            }
        }
        if(i > 0){
            return false;
        }
        return true;


    }
    public static boolean has_won(int[][] x){
        for(int[] y : x){
            for(int z : y){
                if(z == 2048){
                    return true;
                }
            }
        }
        return false;
    }

    public static void make_a_new_two_show_up(int[][] x){
        Random random = new Random();
        int a = random.nextInt(4);
        int b = random.nextInt(4);
        while(x[a][b] != 0) {
            a = random.nextInt(4);
            b = random.nextInt(4);
        }
        x[a][b] = 2;
    }
    public static void main(String[] args){
        int[][] y = showboard();
        System.out.println("This is game 2048 by Ayush Aditya please enjoy");
        for (int[] x : y) {
            for (int z : x) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        int[][] a = moveStuff(y);
        boolean b = is_the_list_filled(a);
        boolean c =  has_won(a);
        while(!b && !c){
            for (int[] x : a) {
                for (int z : x) {
                    System.out.print(z + " ");
                }
                System.out.println();
            }
            a = moveStuff(a);
            b = is_the_list_filled(a);
            c = has_won(a);
        }
        if(c){
            System.out.println("Congratulations, You've Won !");
        }

        if(b){
            System.out.println("Game over!");
        }
    }
}
