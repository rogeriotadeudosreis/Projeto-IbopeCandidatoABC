package classes;

import java.util.Scanner;

public class IbopeCandidatoABC {

    public static void main(String[] args) {
        String candidatoEscolhido = "";
        int candidatoA = 0;
        int A = 0;
        String candMaisVotado = "";
        int candidatoB = 0;
        int B = 0;
        int candidatoC = 0;
        int C = 0;
        int idadeEleitor = 0;
        char sexoEleitor = '0';
        int contSexoMasculinoEleitorA = 0;
        int contSexoMasculinoEleitorB = 0;
        int contSexoMasculinoEleitorC = 0;
        float mediaIdade = 0;
        int contIdade = 0;
        int contIdadeEleitoresCandidatoA = 0;
        int contSexoA = 0;
        int contIdadeEleitoresCandidatoB = 0;
        int contSexoB = 0;
        int contIdadeEleitoresCandidatoC = 0;
        int contSexoC = 0;
        int somaDeVotos = 0;
        String preferencia = "";
        int cont = 0;

        Scanner teclado = new Scanner(System.in);

        while (!candidatoEscolhido.equalsIgnoreCase("S")) {
            System.out.print("1) Candidato A\n2) Candidato B\n3) Candidato C\nS) Sair\nEscolha seu candidato acima:\n");
            candidatoEscolhido = teclado.next();

            if (!candidatoEscolhido.equalsIgnoreCase("S")) {
                System.out.println("Informe a idade do eleitor: ");
                idadeEleitor = teclado.nextInt();
                System.out.println("Informe o sexo do eleitor: F (Feminino) ou M (masculino)");
                sexoEleitor = teclado.next().charAt(0);

                if (candidatoEscolhido.equals("1")) {
                    candidatoA++;
                    A = candidatoA;
                    contIdadeEleitoresCandidatoA += idadeEleitor;

                    if (sexoEleitor == 'm' || sexoEleitor == 'M') {
                        contSexoMasculinoEleitorA++;
                        contSexoA = contSexoMasculinoEleitorA;

                    }

                }
                if (candidatoEscolhido.equals("2")) {
                    candidatoB++;
                    B = candidatoB;
                    contIdadeEleitoresCandidatoB += idadeEleitor;

                    if (sexoEleitor == 'm' || sexoEleitor == 'M') {
                        contSexoMasculinoEleitorB++;
                        contSexoB = contSexoMasculinoEleitorB;

                    }

                }
                if (candidatoEscolhido.equals("3")) {
                    candidatoC++;
                    C = candidatoC;
                    contIdadeEleitoresCandidatoC += idadeEleitor;

                    if (sexoEleitor == 'm' || sexoEleitor == 'M') {
                        contSexoMasculinoEleitorC++;
                        contSexoC = contSexoMasculinoEleitorC;

                    }

                }
                if (A >= B && A >= C) {
                    somaDeVotos = A;
                    candMaisVotado = "Candidato A";
                    contIdade = contIdadeEleitoresCandidatoA;

                } else if (B >= A && B >= C) {
                    somaDeVotos = B;
                    candMaisVotado = "Candidato B";
                    contIdade = contIdadeEleitoresCandidatoB;

                } else {
                    somaDeVotos = C;
                    candMaisVotado = "Candidato C";
                    contIdade = contIdadeEleitoresCandidatoC;

                }

                if (contSexoA >= contSexoB && contSexoA >= contSexoC) {
                    preferencia = " candidato A";
                } else if (contSexoB >= contSexoA && contSexoB >= contSexoC) {
                    preferencia = " candidato B";
                } else {
                    preferencia = " candidato C";
                }
                cont++;
            }
           
        }
        teclado.close();
        mediaIdade = (float) contIdade / somaDeVotos;
        System.out.println("Quantidade de votos do candidato A --> " + candidatoA);
        System.out.println("Quantidade de votos do candidato B --> " + candidatoB);
        System.out.println("Quantidade de votos do candidato C --> " + candidatoC);
        System.out.println("Soma do contador para simples conferência --> " + cont);
        System.out.println("O Candidato mais votado foi --> " + candMaisVotado + " com --> " + somaDeVotos + " votos!");
        System.out.println("Soma das idades dos eleitores do candidato mais votado --> " + contIdade);
        System.out.println("A média das idades dos eleitores do candidato mais votado é --> " + mediaIdade);
        System.out.println("O candidato preferido dos homens é o  --> " + preferencia);

    }

    private static void nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
