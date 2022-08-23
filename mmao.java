class mmao{
  public static void main(String[] args){
 int[][] grid =new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
int a=maxIncreaseKeepingSkyline(grid);
System.out.println(""+a);
}    static int maxIncreaseKeepingSkyline(int[][] grid) {
      int[] row=new int[100];
      int[] col=new int[100];
      int sum=0;
      for(int i=0;i<grid[0].length;i++){
          for(int j=0;j<grid[0].length;j++){
              int num=0;
              num=grid[i][j];
              row[i]=Math.max(row[i],num);
              col[j]=Math.max(col[j],num);
          }
        }
      for(int a=0;a<grid[0].length;a++){
          for(int b=0;b<grid[0].length;b++){
              int compera=0;
              int add=0;
              add=grid[a][b];
              compera=Math.min(row[a],col[b]);
              sum+=compera-add;
              }
          }

return sum;
}
}