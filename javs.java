void printfirstLine(String filepath) {
BufferedReader r = null;
String line;
try {
r = new BufferedReader(new FileReader(filepath));
line = r.readLine();
}catch(Exception e){
System.out.println("Exception!");
}
System.out.println(line);
}
