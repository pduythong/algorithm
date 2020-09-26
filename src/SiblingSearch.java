import java.util.Arrays;

/*
"Henry is very interested in history and all the generations of his family. He does a lot research and realizes that he is descended from the great Mayan dynasty. After a lot of searching through ancient records and the latest records of the society, he is able to find out all the parent-child relationship in his family all the way from the great emperor Ming of the dynasty to himself

These relationships are given in the form a linear array where emperor is at the first position and his children are at pos (2i + 1) and (2i + 2)

This is the pattern followed throughout.

Henry wants to figure out all the siblings of the person X from the data.

Return the sorted list of all of john's siblings.

If no sibling return {-1}

input 1: N, the length of the array
input2: An array representing the ancentral tree
input 3 : X, the person whose siblings are sought.

output - return the array of all siblings in increasingly sorted order.

Examples :

input 1 : 5
input 2 : {1,2,3,4,5}
input 3 : 1

out put : {-1}

Explanation : x is the root of the tree and has no siblings

input 1 : 6
input 2 : {1,2,3,4,5,6}
input 3 : 5

output : {4,6}

Explanation : {2,3 } are the children of {1}.
{4,5,6 } are the children of {2,3}, thus the siblings of x= 5 are {4,6}

 */
public class SiblingSearch {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};

        int[] res = findSiblings(0, nums, 5);

        System.out.println(Arrays.toString(res));
    }


    public static int[] findSiblings(int input1, int[] input2, int input3) {
        int[] result = new int[]{-1};

        if (input2[0] == input3) return result;

        int index = -1;
        for (int i = 0; i < input2.length; i++) {
            if (input2[i] == input3) {
                index = i;
                break;
            }
        }

        if (index > -1) {
            result = new int[]{input2[index - 1], input2[index + 1]};

        }
        return result;
    }


}
