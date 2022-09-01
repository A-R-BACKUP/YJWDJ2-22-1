#### 파일종류: 텍스트파일, 이진파일

- 1 ) 텍스트 파일
  - 모든 데이터 문자 코드로 저장.
  - 보통 메모장으로 열 수 있으면 텍스트 파일

- 2 ) 이진 파일
  - 메모리 데이터 표현방식 그대로 저장
  - 보통 메모장으로 읽어낼 수 없는 파일
  - hwp 파일 등등....

#### 파일 입출력

- 1 ) 텍스트 파일 입출력: 마치 콘솔 입출력하듯이
  - Scanner sc = new Scanner(System.in);
  - System.out.println();
  - Scanner sc = new Scanner(new FileReader("in.txt"));
  - PrintWriter pr = new PrintWriter(new FileWriter("out.txt));
