package others;

import java.util.*;

public class streams {

	public static void main(String[] args) {

		
		
	}

}

//def solution(queries):
//    return_value = []
//    outer_dict = {}
//    inner_dict = {}
//    for query in queries:
//        print(return_value)
//        print(outer_dict)
//        if query[0] == 'SET':
//            return_value.append("")
//            if query[2] not in outer_dict:
//                outer_dict[query[2]] = {}
//            outer_dict[query[2]][query[3]] = query[4]
//        elif query[0] == 'COMPARE_AND_SET':
//            if query[2] in outer_dict:
//                if query[3] in outer_dict[query[2]] and query[4] == outer_dict[query[2]][query[3]]:
//                    return_value.append("true")
//                    outer_dict[query[2]][query[3]] = query[5]
//                else:
//                    return_value.append("false")
//            else:
//                    return_value.append("false")
//        elif query[0] == 'COMPARE_AND_DELETE':
//            if query[2] in outer_dict:
//                # print( outer_dict[query[2]], outer_dict[query[2]][query[3]])
//                if query[3] in outer_dict[query[2]] and query[4] == outer_dict[query[2]][query[3]]:
//                    return_value.append("true")
//                    del outer_dict[query[2]][query[3]]
//                else:
//                    return_value.append("false")
//            else:
//                return_value.append("false")
//        else :
//            if query[2] in outer_dict:
//                if query[3] in outer_dict[query[2]]:
//                    return_value.append(outer_dict[query[2]][query[3]])
//                else:
//                    return_value.append("")
//            else :
//                return_value.append("")
//            
//    print(return_value)
//    print(outer_dict)
//    
//    return return_value