public class Detail {
  int Search(int[] list, int key) {
for (int i = 0; i < list.length; i++) {
 if (key == list[i])
 return i;
 }
 return -1;

 }
 }