import java.util.Scanner;
import java.io.IOException;
/**
* This class evidences the use of operations
* @author Carlos Pantoja
*/
public class PreLabCarlosPantoja{
	public static void main (String args[]){
		cls();
		Scanner lector = new Scanner(System.in);
		String characterstrings[] = new String[3];
		double positivereals[] = new double[2];
		int option = 0;
		int integercontainerlength[] = new int[3];
		int integercontainerzero[] = null;
		int integercontainerone[] = null;
		int integercontainertwo[] = null;
		int[] integercontainerzerofactor = null;
		int[] integercontaineronefactor = null;
		do{
			System.out.println("Welcome to the Lab menu #1\n");
			System.out.println("01: Enter three character strings");
			System.out.println("02: See the length of the three character strings");
			System.out.println("03: See the concatenation of the three character strings");
			System.out.println("04: See a character from each character string\n");
			System.out.println("05: Enter two positive real numbers");
			System.out.println("06: See the division of the two positive real numbers");
			System.out.println("07: See the entire part of the division and its residue\n");
			System.out.println("08: Enter three containers of integers");
			System.out.println("09: See the three integer containers");
			System.out.println("10: See the average of one of the containers");
			System.out.println("11: See the highest value of one of the containers");
			System.out.println("12: Add / Subtract / Multiply two of the three containers");
			System.out.println("13: Join two of the three containers with repeated elements");
			System.out.println("14: Join two of the three containers without repeated elements");
			System.out.println("15: Intersect the three containers - repeated elements");
			System.out.println("16: Rotate items in a container n positions");
			System.out.println("17: Sort a container from smallest to largest");
			
			option = lector.nextInt(); 
			lector.nextLine();
			switch(option){
				case 1:
					for (int i = 0; i < 3; i++){ 
						System.out.println("\nEnter the character string #"+(i+1));
						characterstrings[i] = lector.nextLine();
					}
				break;
				
				case 2:
					if(characterstrings[0] == null || characterstrings[1] == null || characterstrings[2] == null){
						System.out.println("\nYou must first enter the three character strings");
					} else{ 
						for (int i = 0; i < 3; i++){
							System.out.println("\nThe length of the character string #"+(i+1)+" is "+characterstrings[i].length());
						}
					}
				break;
				
				case 3:
					if(characterstrings[0] == null || characterstrings[1] == null || characterstrings[2] == null){
						System.out.println("\nYou must first enter the three character strings");
					} else{ 
						System.out.println("\nThe concatenation of the three character strings is:");
						System.out.println(characterstrings[0]+characterstrings[1]+characterstrings[2]);
					}
				break;
				
				case 4:
					if(characterstrings[0] == null || characterstrings[1] == null || characterstrings[2] == null){
						System.out.println("\nYou must first enter the three character strings");
					} else{ 
						int characterposition;
						for(int i = 0; i < 3; i++){
							System.out.println("\nEnter the position of the desired character of the character string #"+(i+1));
							characterposition = lector.nextInt();
							lector.nextLine();
							if(characterstrings[i].length() < characterposition || characterposition <= 0){
								System.out.println("The position entered is not valid");
							} 
							else if(characterstrings[i].charAt((characterposition-1)) == ' '){
								System.out.println("\nThe character #"+characterposition+" of the character string #"+(i+1)+" is a space");
							} else{
								System.out.println("\nThe character #"+characterposition+" of the character string #"+(i+1)+" is "+characterstrings[i].charAt((characterposition-1)));
							}
						}
					}
				break;
				
				case 5:
					for(int i = 0; i < 2; i++){
						System.out.println("\nEnter the positive real number #"+(i+1));
						positivereals[i] = lector.nextDouble();
						lector.nextLine();
						if(positivereals[i] <= 0){
							System.out.println("\nThe number entered is not a positive real");
							i = 2;
						}
					}
				break;
				
				case 6:
					if(positivereals[0]==0||positivereals[1]==0){ System.out.println("\nYou must first enter the two positive real numbers");}
					else{
						double realdivision;
						realdivision = positivereals[0]/positivereals[1];
						System.out.println("\nThe division of the two positive real numbers is "+realdivision);
					}
				break;
				
				case 7:
					if(positivereals[0]==0||positivereals[1]==0){ System.out.println("\nYou must first enter the two positive real numbers");}
					else{
						int integerdivision; double divisionwaste = 0;
						integerdivision = (int)(positivereals[0] / positivereals[1]);
						divisionwaste = positivereals[0] - (positivereals[1]*integerdivision);
						System.out.println("\nThe entire division of the two positive real numbers is "+integerdivision);
						System.out.println("\nThe residue of said division is "+divisionwaste);
					}
				break;
				
				case 8:
					for(int i = 0; i < 3; i++){
						System.out.println("\nEnter the length of the integer container #"+(i+1));
						int containerlength;
						containerlength = lector.nextInt();
						lector.nextLine();
						if(containerlength > 0){
							integercontainerlength[i]=containerlength;
							if(i==0){integercontainerzero = new int[integercontainerlength[i]];}
							else if(i==1){integercontainerone = new int[integercontainerlength[i]];}
							else if(i==2){integercontainertwo = new int[integercontainerlength[i]];}
							for(int k=0; k<integercontainerlength[i]; k++){
								System.out.println("\nEnter the integer from box #"+(k+1)+" of container #"+(i+1));
								if(i==0){ integercontainerzero[k] = lector.nextInt(); lector.nextLine();}
								else if(i==1){ integercontainerone[k] = lector.nextInt(); lector.nextLine();}
								else if(i==2){ integercontainertwo[k] = lector.nextInt(); lector.nextLine();}
							}
						} else{
							System.out.println("\nThe length entered is not valid for a container");
							i = 4;
						}
					}
				break;
				
				case 9:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						for(int i = 0; i < 3; i++){
							System.out.print("\nEl contenedor #"+(i+1)+" tiene una longitud de "+integercontainerlength[i]+" casillas y esta compuesto por: ");
							if(i == 0){ 		
								String lettercontainerzero = deploycontainer(integercontainerzero);
								System.out.println(lettercontainerzero);
							}
							else if(i == 1){
								String lettercontainerone = deploycontainer(integercontainerone);
								System.out.println(lettercontainerone);
							}
							else if(i == 2){
								String lettercontainertwo = deploycontainer(integercontainertwo);
								System.out.println(lettercontainertwo);
							}
						}
					}
				break;
				
				case 10:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						System.out.println("\nElija un contenedor para calcular su promedio\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
						int operator = lector.nextInt();
						lector.nextLine();
						integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);
						int average = calculateAverage(integercontainerzerofactor);
						System.out.println("\nEl valor promedio del contenedor #"+operator+" es "+average);
					}
				break;
				
				case 11:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						System.out.println("\nElija un contenedor para ver su mayor valor\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
						int operator = lector.nextInt();
						lector.nextLine();
						integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);
						int maximumvalue = maxValue(integercontainerzerofactor);
						System.out.println("\nEl mayor valor del contenedor #"+operator+" es "+maximumvalue);
					}
				break;
				
				case 12:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						System.out.print("\nElija la operacion a realizar\n1: Sumar\n2: Restar\n3: Multiplicar\n");
						int operation = lector.nextInt();
						lector.nextLine();
						for(int i=1; i<3; i++){
							System.out.println("\nIngrese el contenedor a operar #"+i+"\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
							int operator = lector.nextInt();
							lector.nextLine();
							if(i==1){ integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);}
							else if(i==2){ integercontaineronefactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);}
						}
						if(integercontainerzerofactor == null||integercontaineronefactor == null){
							System.out.println("\nAl menos una seleccion de contenedor no es valida");
						} else{
							int[] containerleftoperation = null;
							if(operation==1){ containerleftoperation = calculatesum(integercontainerzerofactor, integercontaineronefactor);}
							else if(operation==2){ containerleftoperation = calculateSubtraction(integercontainerzerofactor, integercontaineronefactor);}
							else if(operation==3){ containerleftoperation = calculateMultiplication(integercontainerzerofactor, integercontaineronefactor);}
							else{ System.out.println("La opcion de operacion ingresada no es valida");}
							if(containerleftoperation!=null){
								System.out.print("\nEl nuevo contenedor tiene una longitud de "+containerleftoperation.length+" casillas y esta compuesto por: ");
								String containerletter = deploycontainer(containerleftoperation);
								System.out.println(containerletter);
							}
						}
					}
				break;
				
				case 13:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						for(int i=1; i<3; i++){
							System.out.println("\nIngrese el contenedor a unir #"+i+"\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
							int operator = lector.nextInt();
							lector.nextLine();
							if(i==1){ integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);}
							else if(i==2){ integercontaineronefactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);}
						}
						if(integercontainerzerofactor == null||integercontaineronefactor == null){
							System.out.println("\nAl menos una seleccion de contenedor no es valida");
						} else{
							int[] containerleftoperation = joinContainers(integercontainerzerofactor, integercontaineronefactor);
							System.out.print("\nEl nuevo contenedor tiene una longitud de "+containerleftoperation.length+" casillas y esta compuesto por: ");
							String containerletter = deploycontainer(containerleftoperation);
							System.out.println(containerletter);
						}
					}
				break;
				
				case 14:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						for(int i=1; i<3; i++){
							System.out.println("\nIngrese el contenedor a unir #"+i+"\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
							int operator = lector.nextInt();
							lector.nextLine();
							if(i==1){ integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);}
							else if(i==2){ integercontaineronefactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);}
						}
						if(integercontainerzerofactor == null||integercontaineronefactor == null){
							System.out.println("\nAl menos una seleccion de contenedor no es valida");
						} else{
							int[] containerleftoperation = joinContainers(integercontainerzerofactor, integercontaineronefactor);
							containerleftoperation = deleteRepeated(containerleftoperation);
							System.out.print("\nEl nuevo contenedor tiene una longitud de "+containerleftoperation.length+" casillas y esta compuesto por: ");
							String containerletter = deploycontainer(containerleftoperation);
							System.out.println(containerletter);
						}
					}
				break;
				
				case 15:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						int[] containerleftoperation = joinContainers(integercontainerzero, integercontainerone);
						String containerletter = "";
						containerleftoperation = joinContainers(containerleftoperation, integercontainertwo);
						containerleftoperation = deleteRepeated(containerleftoperation);
						for(int i=0; i<containerleftoperation.length; i++){
							boolean existsinzero = existsinContainer(containerleftoperation[i], integercontainerzero);
							boolean existsinone = existsinContainer(containerleftoperation[i], integercontainerone);
							boolean existsintwo = existsinContainer(containerleftoperation[i], integercontainertwo);
							if(existsinzero&&existsinone&&existsintwo){
								containerletter += containerleftoperation[i];
							}
						}
						containerleftoperation = stringtocontainerConversion(containerletter);
						System.out.print("\nEl nuevo contenedor tiene una longitud de "+containerleftoperation.length+" casillas y esta compuesto por: ");
						containerletter = deploycontainer(containerleftoperation);
						System.out.println(containerletter);
					}
				break;
				
				case 16: 
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						System.out.println("\nElija un contenedor para girar sus elementos n posiciones\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
						int operator = lector.nextInt();
						lector.nextLine();
						integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);
						System.out.println("\nDigite el numero de posiciones a girar");
						operator = lector.nextInt();
						lector.nextLine();
						int[] containerleftoperation = turnContainer(integercontainerzerofactor, operator);
						System.out.print("\nEl nuevo contenedor tiene una longitud de "+containerleftoperation.length+" casillas y esta compuesto por: ");
						String containerletter = deploycontainer(containerleftoperation);
						System.out.println(containerletter);
					}
				break;
				
				case 17:
					if(integercontainerlength[0] <= 0||integercontainerlength[1] <= 0||integercontainerlength[2] <= 0){
						System.out.println("\nYou must first enter the three containers of integers");
					} else{
						System.out.println("\nElija un contenedor a ordenar de menor a mayor\n1: Usar contenedor #1\n2: Usar contenedor #2\n3: Usar contenedor #3");
						int operator = lector.nextInt();
						lector.nextLine();
						integercontainerzerofactor = choosecontainer(operator, integercontainerzero, integercontainerone, integercontainertwo);
						int[] containerleftoperation = orderContainer(integercontainerzerofactor);
						System.out.print("\nEl nuevo contenedor tiene una longitud de "+containerleftoperation.length+" casillas y esta compuesto por: ");
						String containerletter = deploycontainer(containerleftoperation);
						System.out.println(containerletter);
					}
				break;
				
				default:
					System.out.println("\nThe option entered is not valid");
				break;
			}
			int bucle = 0, add = 0;
			do{
				if(add!=0){System.out.println("\nThe option entered is not valid, please try again");}
				System.out.println("\n00: Return to the Laboratory menu #1"); System.out.println("01: End program execution");
				option = lector.nextInt(); lector.nextLine();
				if(option == 0){cls(); bucle=0;} else if(option == 1){bucle=0;} else{bucle=1; add++;}
			}while(bucle==1);
		} while(option == 0);
	}
	
	/**
	* This method calculates the integer average of the values of a container
	* @param integercontainer It is the container chosen by the user. integercontainer != null
	*
	* @return average
	*/
	public static int calculateAverage(int[] integercontainer){
		int average = 0;
		for(int i=0; i<integercontainer.length; i++){
			average += integercontainer[i];
		}
		average /= integercontainer.length;
		return average;
	}
	
	/**
	* This method searches, stores and returns the highest value of a container
	* @param integercontainer It is the container chosen by the user. integercontainer != null
	*
	* @return maximumvalue
	*/
	public static int maxValue(int[] integercontainer){
		int maximumvalue = 0;
		for(int i=0; i<integercontainer.length; i++){
			if(integercontainer[i]>maximumvalue){
				maximumvalue = integercontainer[i];
			}
		}
		return maximumvalue;
	}
	
	/**
	* This method searches, stores and returns the highest value of a container
	* @param operator This is the container number chosen by the user. operator==1 || operator==2 || operator==3
	* @param integercontainerzero It is the container entered by the user. integercontainerzero != null
	* @param integercontainerone It is the container entered by the user. integercontainerone != null
	* @param integercontainertwo It is the container entered by the user. integercontainertwo != null
	*
	* @return integercontainer
	*/
	public static int[] choosecontainer(int operator, int[] integercontainerzero, int[] integercontainerone, int[] integercontainertwo){
		int[] integercontainer = null;
		if(operator==1){integercontainer=integercontainerzero;}
		else if(operator==2){integercontainer=integercontainerone;}
		else if(operator==3){integercontainer=integercontainertwo;}
		return integercontainer;
	}
	
	/**
	* This method creates an integer by taking each position of an array as a number digit.
	* @param integercontainer It is the container chosen by the user. integercontainer != null
	*
	* @return integer
	*/
	public static int transformcontainer(int[] integercontainer){
		int integer = integercontainer[0];
		for(int i=1; i<integercontainer.length; i++){
			integer*= 10; integer += integercontainer[i];
		}
		return integer;
	}
	
	/**
	* This method creates a container from a string composed of numbers using each position as a container box
	* @param conversion It is the chain that you want to convert. conversion != null && conversion != "" && conversion != " "
	*
	* @return integercontainer 
	*/
	public static int[] stringtocontainerConversion(String conversion){
		int[] integercontainer = new int [conversion.length()];
		String characters [] = new String[conversion.length()];
		for(int i=0; i<conversion.length(); i++){
			characters[i] = ""+conversion.charAt(i);
			integercontainer[i] = Integer.parseInt(characters[i]);
		}
		return integercontainer;
	}
	
	/**
	* This method simulates the sum of two numbers using containers
	* <br><br><b>Pre:</b><br> All container numbers must be one digit.
	* @param integercontainerzerofactor This is one of the containers chosen by the user. integercontainerzerofactor != null
	* @param integercontaineronefactor This is one of the containers chosen by the user. integercontaineronefactor != null
	*
	* @return sum 
	*/
	public static int[] calculatesum(int[] integercontainerzerofactor, int[] integercontaineronefactor){
		int integerzero = transformcontainer(integercontainerzerofactor);
		int integerone = transformcontainer(integercontaineronefactor);
		String lettersum = ""+(integerzero+integerone);
		int[] sum = stringtocontainerConversion(lettersum);
		return sum;
	}
	
	/**
	* This method simulates the subtraction of two numbers using containers
	* <br><br><b>Pre:</b><br> All container numbers must be one digit.
	* @param integercontainerzerofactor This is one of the containers chosen by the user. integercontainerzerofactor != null
	* @param integercontaineronefactor This is one of the containers chosen by the user. integercontaineronefactor != null
	*
	* @return subtraction
	*/
	public static int[] calculateSubtraction(int[] integercontainerzerofactor, int[] integercontaineronefactor){
		int integerzero = transformcontainer(integercontainerzerofactor);
		int integerone = transformcontainer(integercontaineronefactor);
		String lettersubtraction = (""+(integerzero-integerone)).replaceAll("\\-", "");
		int[] subtraction = stringtocontainerConversion(lettersubtraction);
		if((integerzero-integerone)<0){ subtraction[0] *= -1;}
		return subtraction;
	}
	
	/**
	* This method simulates the multiplication of two numbers using containers
	* <br><br><b>Pre:</b><br> All container numbers must be one digit.
	* @param integercontainerzerofactor This is one of the containers chosen by the user. integercontainerzerofactor != null
	* @param integercontaineronefactor This is one of the containers chosen by the user. integercontaineronefactor != null
	*
	* @return multiplication
	*/
	public static int[] calculateMultiplication(int[] integercontainerzerofactor, int[] integercontaineronefactor){
		int integerzero = transformcontainer(integercontainerzerofactor);
		int integerone = transformcontainer(integercontaineronefactor);
		String lettermultiplication = ""+(integerzero*integerone);
		int[] multiplication = stringtocontainerConversion(lettermultiplication);
		return multiplication;
	}
	
	/**
	* This method generates a creative model of a container in a string
	* @param integercontainer It is the container chosen by the user. integercontainer != null
	*
	* @return lettercontainer
	*/
	public static String deploycontainer(int[] integercontainer){
		String lettercontainer="";
		for(int i=0; i<integercontainer.length; i++){
			if(integercontainer.length==1){ lettercontainer += ("["+integercontainer[i]+"]");}
			else if(i==(integercontainer.length-1)){ lettercontainer += (integercontainer[i]+"]");} 
			else if(i==0){ lettercontainer += ("["+integercontainer[i]+",");}
			else{ lettercontainer += (integercontainer[i]+",");}
		}
		return lettercontainer;
	}
	
	/**
	* This method joins two containers in one
	* @param integercontainerzerofactor This is one of the containers chosen by the user. integercontainerzerofactor != null
	* @param integercontaineronefactor This is one of the containers chosen by the user. integercontaineronefactor != null
	*
	* @return containerleftoperation
	*/
	public static int[] joinContainers(int[] integercontainerzerofactor, int[] integercontaineronefactor){
		int[] containerleftoperation = new int [integercontainerzerofactor.length+integercontaineronefactor.length];
		for(int i=0; i<integercontainerzerofactor.length; i++){
			containerleftoperation[i] = integercontainerzerofactor[i];
		}
		for(int i=integercontainerzerofactor.length; i<containerleftoperation.length; i++){
			containerleftoperation[i] = integercontaineronefactor[i-integercontainerzerofactor.length];
		}
		return containerleftoperation;
	}
	
	/**
	* This method removes all repeated numbers from a container
	* @param containerleftoperation It is the container chosen by the user. containerleftoperation != null
	*
	* @return containerleftoperation
	*/
	public static int[] deleteRepeated(int[] containerleftoperation){
		String lettercontainer = "";
		int[] exceptions = new int[containerleftoperation.length];
		exceptions[0] = 1;
		for(int i=0; i<containerleftoperation.length; i++){
			if(i!=exceptions[i]){
				for(int k=(i+1); k<containerleftoperation.length; k++){
					if(containerleftoperation[i]==containerleftoperation[k]){ exceptions[k]=k;}
					if(k==(containerleftoperation.length-1)){ lettercontainer += containerleftoperation[i];}
				}
			}
		}
		containerleftoperation = stringtocontainerConversion(lettercontainer);
		return containerleftoperation;
	}
	
	/**
	* This method verifies if a number exists in the three containers
	* @param integer This is the number to evaluate.
	* @param integercontainerzerofactor This is one of the containers chosen by the user. integercontainerzerofactor != null
	*
	* @return exists
	*/
	public static boolean existsinContainer(int integer, int[] integercontainerzerofactor){
		boolean exists = false;
		for(int i=0; i<integercontainerzerofactor.length && !exists; i++){
			if(integer == integercontainerzerofactor[i]){
				exists = true;
			}
		}
		return exists;
	}
	
	/**
	* This method rotates the elements of a container n positions
	* @param integercontainerzerofactor It is the container entered by the user. integercontainerzerofactor != null
	* @param operator This is the number of positions to turn.
	*
	* @return containerleftoperation
	*/
	public static int[] turnContainer(int[] integercontainerzerofactor, int operator){
		int[] containerleftoperation = new int[integercontainerzerofactor.length];
		if(operator>=integercontainerzerofactor.length){
			operator = operator%integercontainerzerofactor.length;
		}
		for(int i=0; i<integercontainerzerofactor.length; i++){
			int move = i+operator;
			if(move>=integercontainerzerofactor.length){
				move = move%integercontainerzerofactor.length;
			}
			containerleftoperation[move] = integercontainerzerofactor[i];
		}
		return containerleftoperation;
	}
	
	/**
	* This method orders the elements of a container from least to greatest
	* @param containerleftoperation It is the container chosen by the user. containerleftoperation != null
	*
	* @return containerleftoperation
	*/
	public static int[] orderContainer(int[] containerleftoperation){
		for(int i=1; i<containerleftoperation.length; i++){
			if(containerleftoperation[i-1]>containerleftoperation[i]){
				int temp = containerleftoperation[i-1];
				containerleftoperation[i-1] = containerleftoperation[i];
				containerleftoperation[i] = temp;
				i=0;
			}
		}
		return containerleftoperation;
	}
	
	/**
	* This method cleans the cmd screen
	*/
	public static void cls(){
		try{ new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}
		catch(Exception E){ System.out.println(E);}
	}
}