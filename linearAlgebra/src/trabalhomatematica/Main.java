package trabalhomatematica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// matrix construtor (rows, cols, elementos<ArrayList>)
		// Vector construtor (elementos<ArrayList>)

		// classe de transformações

		Scanner input = new Scanner(System.in);
		System.out.println("O que deseja executar? (entrada)/[seleção]\n");
		System.out.println("    *pagerank (matriz adjacência)           - [1]"+"\n");
		System.out.println("    *matriz transposta de A (matriz)        - [2]"+"\n");
		System.out.println("    *multiplicação A*B (matriz && matriz)   - [3]"+"\n");
		System.out.println("    *multiplicação A*B (matriz && vetor)    - [4]"+"\n");
		System.out.println("    *multiplicação A*B (matriz && numeral)  - [5]"+"\n");
		System.out.println("    *multiplicação A*B (vetor && numeral)   - [6]"+"\n");
		System.out.println("    *soma A+B (matriz && matriz)            - [7]"+"\n");
		System.out.println("    *soma A+B (vetor && vetor)              - [8]"+"\n");
		System.out.println("    *norma de vetor A (vetor)               - [9]"+"\n");
		System.out.println("    *tranformações                          - [10]"+"\n");
	
		System.out.print("seleção: ");
		int multiplex = input.nextInt();
		
		
		Transformations tr = new Transformations();
		System.out.println("-----------------------------------------------"+"\n");
		switch(multiplex) {
			case 1:
				
				System.out.print("numero de lihas/colunas da matriz adjacência: ");
				int rowCol = input.nextInt();
				ArrayList<Double> elements = new ArrayList<Double>(rowCol*rowCol);
				System.out.println("digite os elementos(em 0 ou 1) da matriz adjacência [Double]: ");
				for(int i=0; i<rowCol*rowCol;i++) {
					elements.add(input.nextInt()*1.0);
				}
				System.out.println("\n"+"-----------------------------------------------");
				System.out.println("\n"+"resultado final ao vetor de autoridade:"+"\n");
				pageRank(new Matrix(rowCol, rowCol, elements));
				break;
				
				
			
			case 2:
				
				Matrix A2 = newMatriz("A");
				
				Matrix At = tr.transpose(A2);
				mostrarMatriz(At, "resultado matriz At:");
				
				break;
		
				
			case 3:

				Matrix A3 = newMatriz("A");
				Matrix B3 = newMatriz("B");
				
				mostrarMatriz(tr.times(A3, B3), "resultado matriz AB:");
				
				break;
		
			case 4:
				
				Matrix A4 = newMatriz("A");
				Vector v4 = newVector("B"); 
				
				mostrarVetor(tr.times(A4, v4), "resultado vetor AB:");
				
				break;
			
			case 5:
				
				
				Matrix A5 = newMatriz("A");
				System.out.print("Multiplicador: ");
				Double d5 = input.nextDouble();
			
				mostrarMatriz(tr.times(A5, d5), "resultado Matriz A*Double:");
				
				break;
				
			case 6:
				
				Vector v6 = newVector("A"); 
				System.out.print("multiplicador: ");
				Double d6 = input.nextDouble();
			
				mostrarVetor(tr.times(v6, d6), "resultado Vetor A*Double:");
				
				break;
				
				
			case 7:
				
				Matrix A7 = newMatriz("A");
				Matrix B7 = newMatriz("B");
				mostrarMatriz(tr.sum(A7, B7), "resultado matriz A+B:");
				
				break;
				
			case 8:
				
				Vector A8 = newVector("A");
				Vector B8 = newVector("B");
	
				mostrarVetor(tr.sum(A8, B8), "resultado vetor A+B:");
				break;
			
			case 9:
				
				Vector A9 = newVector("A");
				System.out.println("\n"+"-----------------------------------------------");
				System.out.println("\n"+"resultado norma vetor A:"+"\n");
				System.out.println(tr.normaVector(A9));
				break;
				
			case 10:
				
				System.out.println("Qual transformação? (entrada)/[seleção]\n");
				System.out.println("    *translação 2d/3d                       - [1]"+"\n");
				System.out.println("    *rotação 2d                             - [2]"+"\n");
				System.out.println("    *rotação 3d em x                        - [3]"+"\n");
				System.out.println("    *rotação 3d em y                        - [4]"+"\n");
				System.out.println("    *rotação 3d em z                        - [5]"+"\n");
				System.out.println("    *reflexão 2d em x                       - [6]"+"\n");
				System.out.println("    *reflexão 2d em y                       - [7]"+"\n");
				System.out.println("    *reflexão 3d em x                       - [8]"+"\n");
				System.out.println("    *reflexão 3d em y                       - [9]"+"\n");
				System.out.println("    *reflexão 3d em z                       - [10]"+"\n");
				System.out.println("    *projeção 2d                            - [11]"+"\n");
				System.out.println("    *projeção 3d                            - [12]"+"\n");
				System.out.print("seleção: ");
				int multiplex2 = input.nextInt();
				
				switch(multiplex2) {
					case 1:
						
						Vector a21 = newVector("observado");
						Vector b21 = newVector("de transformação");
						mostrarVetor(tr.translacao2D(a21, b21), "translação");
						
						break;
						
						
					case 2:
						Vector a22 = newVector("observado");
						System.out.print("angulo: ");
						Double d22 = input.nextDouble();
						
						mostrarVetor(tr.rotacao2D(a22, d22), "rotação 2d");
						
						break;
					
						
						
					case 3:
						
						Vector a23 = newVector("observado");
						System.out.print("angulo: ");
						Double d23 = input.nextDouble();
						
						mostrarVetor(tr.rotacao2D(a23, d23), "rotação 3d em x");
						
						break;
						
					case 4:
					
						
						Vector a24 = newVector("observado");
						System.out.print("angulo: ");
						Double d24 = input.nextDouble();
						
						mostrarVetor(tr.rotacao2D(a24, d24), "rotação 3d e, y");
						
						break;
					
					case 5:
						
						Vector a25 = newVector("observado");
						System.out.print("angulo: ");
						Double d25 = input.nextDouble();
						
						mostrarVetor(tr.rotacao2D(a25, d25), "rotação 2d");
						
						break;
						
						
					case 6:
						Vector a26 = newVector("observado");
						
						mostrarVetor(tr.reflection2DX(a26), "reflexão 2d em x");
						
						break;
						
					case 7:
						
						Vector a27 = newVector("observado");
						
						mostrarVetor(tr.reflection2DY(a27), "reflexão 2d em y");
						
						break;
						
					case 8:
						
						Vector a28 = newVector("observado");
						
						mostrarVetor(tr.reflection3DX(a28), "reflexão 3d em x");
						
						break;
						
					case 9:
						
						Vector a29 = newVector("observado");
						
						mostrarVetor(tr.reflection3DY(a29), "reflexão 3d em y");
						
						break;
						
					case 10:
						
						Vector a210 = newVector("observado");
						
						mostrarVetor(tr.reflection3DZ(a210), "reflexão 3d em z");
						
						break;
						
					case 11:
						Vector a211 = newVector("observado");
						System.out.print("valor de projeção em x: ");
						Double projx11 = input.nextDouble();
						System.out.print("valor de projeção em y: ");
						Double projy11 = input.nextDouble();
						
						mostrarVetor(tr.projection2D(a211, projx11, projy11), "projeção 2d");
						break;
						
					case 12:
						
						Vector a212 = newVector("observado");
						System.out.print("valor de projeção em x: ");
						Double projx12 = input.nextDouble();
						System.out.print("valor de projeção em y: ");
						Double projy12 = input.nextDouble();
						System.out.print("valor de projeção em y: ");
						Double projz12 = input.nextDouble();
						
						mostrarVetor(tr.projection3D(a212, projx12, projy12, projz12), "projeção 3d");
						
						break;
				}
				
				
				
				break;
				
		}

		input.close();
	}
	

	
	//--------------------------------------------------
	
	public static Matrix newMatriz(String nome) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de linhas da matriz "+nome+": ");
		int r = sc.nextInt();
		System.out.print("Número de colunas da matriz "+nome+": ");
		int c = sc.nextInt();
		ArrayList<Double> elements = new ArrayList<Double>(r*c);
		System.out.println("elementos da matriz "+nome+" [Double]: ");
		for(int i=0; i<(r*c); i++) {
			elements.add(sc.nextDouble());
		}

		Matrix A = new Matrix(r, c, elements);
		
		return A;
		
	}
	
	//----------------------------------------------------
	
	public static Vector newVector(String nome) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de elementos do vetor "+nome+": ");
		int eV = sc.nextInt();
		System.out.println("elementos do vetor "+nome+" [Double]: ");
		ArrayList<Double> elementsV = new ArrayList<Double>(eV);
		for(int i=0; i<eV; i++) {
			elementsV.add(sc.nextDouble());
		}
		
		Vector v = new Vector(elementsV); 
		
		return v
				;
	}
	
	
	
	
	//--------------------------------------------------

	public static void pageRank(Matrix adjacencia) {
		LinearAlgebra Li = new LinearAlgebra();
		Rank sites = new Rank();
		
		Matrix At = Li.transpose(adjacencia);
		Vector a0 = Li.a0(adjacencia);

		Matrix AtA = Li.times(adjacencia, At);

		Vector an = Li.times(AtA, a0);
		Double norma = Li.normaVector(an);
		Double multiplicador = 1 / norma;
		an = Li.times(an, multiplicador);

		for (int i = 0; i < 100000; i++) {
			an = Li.times(AtA, an);
			norma = Li.normaVector(an);
			multiplicador = 1 / norma;
			an = Li.times(an, multiplicador);

		}
		System.out.println(an.getElements());

		for (int i = 0; i < an.getTamanho(); i++) {
			sites.addElement(new Site("site " + (i + 1), an.getElements().get(i)));
		}
		sites.sortSites();
		for (int i = 0; i < sites.getSites().size(); i++) {
			System.out.print(sites.getSites().get(i).getNome());
			System.out.println(sites.getSites().get(i).getAutoridade());

		}

	}
	
	//------------------------------------------------
	
	public static void mostrarMatriz(Matrix m, String mensagem) {
		System.out.println("\n"+"-----------------------------------------------");
		System.out.println("\n"+mensagem+"\n");
		System.out.println("linhas: "+ m.getRows());
		System.out.println("colunas: "+ m.getCols());
		System.out.println("\n"+"["+"\n");
		
		for(int i=0; i<m.getRows(); i++) {
			for(int j=i*m.getCols(); j<m.getCols()+(i*m.getCols()); j++) {
				System.out.print(m.getElements().get(j)+" ");
				
			}
			System.out.println("");
		}
		System.out.println("\n"+"]");
		
	}
	
	//----------------------------------------------------
	
	public static void mostrarVetor(Vector v, String mensagem) {
		System.out.println("\n"+"-----------------------------------------------");
		System.out.println("\n"+mensagem+"\n");
		System.out.println("número de elementos: "+ v.getTamanho());
		System.out.println("\n"+"["+"\n");
		for(Double i: v.getElements()) {
			System.out.println(i);
		}
		System.out.println("\n"+"]");
	}
	
	//--------------------------------------------------
	
	public static Matrix transpose(Matrix m) {
		LinearAlgebra Li = new LinearAlgebra();
		return Li.transpose(m);
	}
	
	//----------------------------------------------------
	
	public static Matrix multiplicationM(Matrix m1, Matrix m2) {
		LinearAlgebra Li = new LinearAlgebra();
		return Li.times(m1, m2);
	}
	
	//------------------------------------------------------
	
}
