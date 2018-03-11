class MyInteger
{
	int value=0;
	MyInteger(int value){
		this.value=value;
	}
	int getValue(){
		return this.value;
	}
	boolean isEven(){
		if(this.value%2==0){
			return true;
		}
		else
			return false;
	}
	boolean isOdd(){
		if(this.value%2==1){
			return true;
		}
		else
			return false;
	}
	boolean isPrime(){
		int m=this.value/2;
		int flag=0;    
  		for(int i=2;i<=m;i++){    
   			if(this.value%i==0){    
   				return false;        
   			}    
  		}       
  		return true;    
	}
	boolean isEven(int passed){
		if(passed%2==0){
			return true;
		}
		else
			return false;
	}
	boolean isOdd(int passed){
		if(passed%2==1){
			return true;
		}
		else
			return false;
	}
	boolean isPrime(int passed){
		int m=passed/2;
		int flag=0;    
  		for(int i=2;i<=m;i++){    
   			if(passed%i==0){    
   				return false;        
   			}    
  		}    
  		//if(flag==0)    
  			return true;    
	}
	boolean isEven(MyInteger obj){
		if(obj.value%2==0){
			return true;
		}
		else
			return false;
	}
	boolean isOdd(MyInteger obj){
		if(obj.value%2==1){
			return true;
		}
		else
			return false;
	}
	boolean isPrime(MyInteger obj){
		int m=obj.value/2;
		int flag=0;    
  		for(int i=2;i<=m;i++){    
   			if(obj.value%i==0){    
   				return false;    
   				        
   			}    
  		}    
  		//if(flag==0)    
  			return true;    
	}
	boolean equals(int passed){
		if(passed==this.value)
			return true;
		else
			return false;
	}
	boolean equals(MyInteger obj){
		if(obj.value==this.value)
			return true;
		else
			return false;
	}
	void parseInt(char[] abc){
		for(int i=0;i<abc.length;i++){
			System.out.print((int)abc[i]+"-");
		}
	}
	void parseInt(String abc){
		for(int i=0;i<abc.length();i++){
			System.out.print((int)abc.charAt(i)+"-");
		}
	}
	public static void main(String[] args) {
		MyInteger mi=new MyInteger(10);
		System.out.println("Even: "+mi.isEven());
		System.out.println("Odd: "+mi.isOdd());
		System.out.println("Prime: "+mi.isPrime());
		System.out.println("Even: "+mi.isEven(20));
		System.out.println("Odd: "+mi.isOdd(33));
		System.out.println("Prime: "+mi.isPrime(13));
		MyInteger mij=new MyInteger(23);
		System.out.println("Even: "+mi.isEven(mij));
		System.out.println("Odd: "+mi.isOdd(mij));
		System.out.println("Prime: "+mi.isPrime(mij));
		System.out.println("Equals(int): "+mi.equals(20));
		System.out.println("Equals(MyInteger): "+mi.equals(mij));
		System.out.println("Parsing(char[])");
		char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
		mi.parseInt(charArray);
		System.out.println("Parsing(String)");
		mi.parseInt("abc");
	}

}