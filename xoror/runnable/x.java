class x {
  public static void main(String[] s) {
      int L = s[0].length();
      for (int G = 0; G < 5; G++) {
        String S = "";  
        for (int N = 0; N < L; N++) {
          char C = (char)(((N>0)?s[0].charAt(N-1):' ') ^ (s[0].charAt(N)) | ((N<L-1)?s[0].charAt(N+1):' '));
          S+=(C>126)?' ':C;
        }
        System.out.println(S);
        s[0] = S;
      }
  }
}
