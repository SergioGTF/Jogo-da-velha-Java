public class Tabuleiro {
    private int[][] tabuleiro = new int[][];

    public Tabuleiro() {
        zerarTabuleiro();
    }

    public void zerarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = 0;
            }
        }
    }

    public void exibeTabuleiro() {
        System.out.println();
        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; linha++) {
                if (tabuleiro[linha][coluna] == -1) {
                    System.out.println(" X ");
                }
                if (tabuleiro[linha][coluna] == 1) {
                    System.out.println(" 0 ");
                }
                if (tabuleiro[linha][coluna] == 0) {
                    System.out.println(" X ");
                }

                if (coluna == 0 || coluna == 1)
                    System.out.println("|");
            }
            System.out.println();
        }
    }

    public int getPosicao(int[] tentativa) {
        return tabuleiro[tentativa[0]][tentativa[1]];
    }

    public void setPosicao(int[] tentativa, int jogador) {
        if (jogador == 1)
            tabuleiro[tentativa[0]][tentativa[1]] = -1;
        else
            tabuleiro[tentativa[0]][tentativa[1]] = 1;

        exibeTabuleiro();
    }

    public int checaLinhas() {
        for (int linha = 0; linha < 3; linha++) {

            if ((tabuleiro[0][linha]) + tabuleiro[1][linha] + tabuleiro[2][linha] == -3)
                return -1;
            if ((tabuleiro[0][linha]) + tabuleiro[1][linha] + tabuleiro[2][linha] == -3)
                return 1;
        }

        return 0;
    }

    public int checaColunas(){
        for(int colunas = 0; colunas<3; colunas++){
            
            if ((tabuleiro[0][colunas]) + tabuleiro[1][colunas] + tabuleiro[2][colunas] == -3)
                return -1;
            if ((tabuleiro[0][colunas]) + tabuleiro[1][colunas] + tabuleiro[2][colunas] == -3)
                return 1;
        }

        return 0;
    }

    public int checaDiagonais(){
        if ((tabuleiro[0][0]) + tabuleiro [1][1] + tabuleiro[2][2])
    }
}
