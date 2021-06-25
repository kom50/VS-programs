#include<stdio.h>
#include<stdlib.h>
#include<string.h>
 // student structure
  typedef struct student{
      int reg_no;
      char name[30];
      char dob[12];
      char dept[15];
      char city[15];
      char program[10];
      int subjects[5];
  }student;

  //initial student array size
  int capacity = 2;
  static regNo = 101;

  // add student details
  void addStudentDetails(student *std, int *size){
        int op;
        if(*size == capacity){
            std = realloc(std, capacity * capacity);
        }
        printf("\n\nEnter following Students details\n");
       // printf("Reg no :- ");
        //scanf("%d", &(std + *size)->reg_no);

        (std + *size)->reg_no = regNo++;
        fflush(stdin);
        printf("Name :-  ");
        gets((std + *size)->name);
        printf("Date of birth :-  ");
        gets((std + *size)->dob);
        printf("City :-  ");
        gets((std + *size)->city);
        top:
            printf("\nDepartments (Computer, Science):-\n");
            printf("Press 1 for Computer department.\n");
            printf("Press 2 for Science department.\n");
            printf("Enter your choice no :-  ");
            scanf("%d", &op);
            switch(op){
                case 1:
                   strcpy((std + *size)->dept, "Computer");
                   break;
                case 2:
                   strcpy((std + *size)->dept, "Science");
                   break;
                default :
                    // If user input invalid choice then it again goto top
                    printf("Invalid Input (^.^).");
                    goto top;
            }
        top1:
            printf("\nPrograms (BSCS,BSS, BSSE) \n");
            printf("Press 1 for BSCS.\n");
            printf("Press 2 for BSS.\n");
            printf("Press 3 for BSSE.\n");
            printf("Enter your choice no :-  ");
            scanf("%d", &op);
            switch(op){
                case 1:
                  strcpy((std + *size)-> program, "BSCS");
                  break;
                case 2:
                  strcpy((std + *size)-> program, "BSS");
                  break;
                case 3:
                  strcpy((std + *size)-> program, "BSSE");
                  break;
                default:
                    printf("Invalid Input (^.^).");
                    goto top1;
            }
        printf("\nEnter 5 subjects marks \n");
        int i, temp;
        for(i = 0; i < 5; i++){
           loop:
            printf("Enter %d subject marks :-  ", (i+ 1));
            scanf("%d", &temp);
            if(temp <= 100 && temp >= 0)
                (std + *size)->subjects[i] = temp;
            else{
                printf("\nInvalid marks number. Please enter correct marks number (0 - 100)\n");
                goto loop;
            }
        }
         // size Increament
        (*size)++;

  }

  void printBoard(){
      printf("\n\n\t\t\t\t\t\t\t<< STUDENT DETAILS >>\n");
      printf("|-------|----------------------|--------------|-----------------|--------------|---------|-------|-------|-------|-------|-------|\n");
      printf("|Reg No |\t  Name         |     DOB      |     City        |  Department  | Program | Sub 1 | Sub 2 | Sub 3 | Sub 4 | Sub 5 |\n");
      printf("|-------|----------------------|--------------|-----------------|--------------|---------|-------|-------|-------|-------|-------|\n");

  }
 // show all student details
  void showStudentData(student *std, int size){
        int i;
        if(size != 0){
            printBoard();
            for(i = 0; i < size; i++)
               printf("|%5d  | %-20s | %-11s  | %-15s | %-12s |   %-5s |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |\n", (std + i)->reg_no, (std + i)->name, (std + i)->dob, (std + i)->city, (std + i)->dept, (std + i)->program, (std + i)->subjects[0], (std + i)->subjects[1], (std + i)->subjects[2], (std + i)->subjects[3], (std + i)->subjects[4]);
            printf("|-------|----------------------|--------------|-----------------|--------------|---------|-------|-------|-------|-------|-------|\n");
        }else{
            printf("Not any data is available...");
        }
        printf("\n\n");
  }

  void removeStudentDetails(student *std, int *size){
        int i, reg, j;
        printf("\n\nEnter reg No. for remove student data :-  ");
        scanf("%d", &reg);
        for(i = 0; i < *size; i++){
            if(reg == (std + i)->reg_no){
                for(j = i; j < *size; j++){
                    *(std + j) = *(std + (j + 1));
                }
                (*size)--;
                printf("\nStudent Data is deleted...\n\n");
                return;
            }
        }
        printf("\nStudent Data is not found...\n\n");
  }

  void searchStudentDetailsByDepartment(student *std, int size){
        int i, op, flag = 0;
        char dept[20];
        top:
            printf("\n\nSelect Department for search student details \n");
            printf("Press 1 for Computer department.\n");
            printf("Press 2 for Science department.\n");
            printf("Enter your choice no :- ");
            scanf("%d", &op);
            switch(op){
                case 1:
                   strcpy(dept, "Computer");
                   break;
                case 2:
                   strcpy(dept, "Science");
                   break;
                default :
                    // If user input invalid choice then it again goto top
                     goto top;
            }
        printBoard();
        for(i = 0; i < size; i++){
           if(strcmp(dept, (std + i)->dept) == 0){
                flag = 1;
                 printf("|%5d  | %-20s | %-11s  | %-15s | %-12s |   %-5s |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |\n", (std + i)->reg_no, (std + i)->name, (std + i)->dob, (std + i)->city, (std + i)->dept, (std + i)->program, (std + i)->subjects[0], (std + i)->subjects[1], (std + i)->subjects[2], (std + i)->subjects[3], (std + i)->subjects[4]);
           }
        }
        printf("|-------|----------------------|--------------|-----------------|--------------|---------|-------|-------|-------|-------|-------|\n");
        if(!flag)
            printf("Data is not found...\n\n");
  }

  // search student details on the basis of city name
  void searchStudentDetailsByCity(student *std, int size){
        int i, flag = 0;
        char city[30], dupCity[30];
        printf("\n\nEnter city name for search :- ");
        fflush(stdin);
        gets(city);
        printBoard();
        for(i = 0; i < size; i++){
           strcpy(dupCity, (std + i)->city);
           if(strcmp(strupr(city), strupr(dupCity)) == 0){
                flag = 1;
                printf("|%5d  | %-20s | %-11s  | %-15s | %-12s |   %-5s |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |\n", (std + i)->reg_no, (std + i)->name, (std + i)->dob, (std + i)->city, (std + i)->dept, (std + i)->program, (std + i)->subjects[0], (std + i)->subjects[1], (std + i)->subjects[2], (std + i)->subjects[3], (std + i)->subjects[4]);
           }
        }
        printf("|-------|----------------------|--------------|-----------------|--------------|---------|-------|-------|-------|-------|-------|\n");
        if(!flag)
            printf("Data is not found...\n\n");
  }


  //  Search Student (one OR more) by Program
  void searchStudentDetailsByProgram(student *std, int size){
        int i, op, flag = 0;
        char temp[8];
        top1:
            printf("\n\nProgram (BSCS,BSS, BSSE) \n");
            printf("Press 1 for BSCS.\n");
            printf("Press 2 for BSS.\n");
            printf("Press 3 for BSSE.\n");
            printf("Enter your choice no :- ");
            scanf("%d", &op);
            switch(op){
                case 1:
                  strcpy(temp, "BSCS");
                  break;
                case 2:
                  strcpy(temp, "BSS");
                  break;
                case 3:
                  strcpy(temp, "BSSE");
                  break;
                default:
                    goto top1;
            }

        printBoard();
        for(i = 0; i < size; i++){
           if(strcmp(temp, (std + i)->program) == 0){
                flag = 1;
                printf("|%5d  | %-20s | %-11s  | %-15s | %-12s |   %-5s |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |\n", (std + i)->reg_no, (std + i)->name, (std + i)->dob, (std + i)->city, (std + i)->dept, (std + i)->program, (std + i)->subjects[0], (std + i)->subjects[1], (std + i)->subjects[2], (std + i)->subjects[3], (std + i)->subjects[4]);
           }

        }
        printf("|-------|----------------------|--------------|-----------------|--------------|---------|-------|-------|-------|-------|-------|\n");
        if(!flag)
            printf("Data is not found...\n\n");
  }


  //Find Total Number of Students of Specific Department

    void findNumberofStudentDepartment(student *std, int size){
        int i, op, number = 0;
        char dept[20];
        top:
            printf("\n\nSelect Department for finding number of students\n");
            printf("Press 1 for Computer department.\n");
            printf("Press 2 for Science department.\n");
            printf("Enter your choice no :- ");
            scanf("%d", &op);
            switch(op){
                case 1:
                   strcpy(dept, "Computer");
                   break;
                case 2:
                   strcpy(dept, "Science");
                   break;
                default :
                    // If user input invalid choice then it again goto top
                     goto top;
            }
        for(i = 0; i < size; i++){
           if(strcmp(dept, (std + i)->dept) == 0){
                number++;
           }
        }
        printf("\n\nTotal Number of Students of \"%s\" Department = %d\n\n", dept, number);
  }


  //Find Average Result of Specific Department
  void averageResult(student *std, int size){
        int i, j, op, sum = 0, number = 0;
        float avg = 0.0;
        char dept[20];
        top:
            printf("\n\nSelect Department for finding number of students\n");
            printf("Press 1 for Computer department.\n");
            printf("Press 2 for Science department.\n");
            printf("Enter your choice no :- ");
            scanf("%d", &op);
            switch(op){
                case 1:
                   strcpy(dept, "Computer");
                   break;
                case 2:
                   strcpy(dept, "Science");
                   break;
                default :
                    // If user input invalid choice then it again goto top
                     goto top;
            }
        for(i = 0; i < size; i++){
           if(strcmp(dept, (std + i)->dept) == 0){
                number++;
                for(j = 0 ; j < 5; j++)
                    sum += (std + i)->subjects[j];
           }
        }
        avg = sum / number;
        printf("\n\nAverage of \"%s\" department = %f\n\n", dept, avg);
  }

    //Search Specific Student by Reg No. and Find whether He is Pass ‘OR’ Fail
    void searchStudentByRegNo(student *std, int size){


    }

    //Find the grade each subject of the student by registration No.
    void findGrade(student *std, int size){

    }


    //Update Existing Student (Using Pointers)
   void updateStudentDetails(student *std, int size){
        int i, regNo, flag = 0, option;
        printf("\n\nEnter Reg No. for update student details :-  ");
        scanf("%d", &regNo);
        for(i = 0; i < size; i++){
            if((std + i)->reg_no == regNo){
                flag = 1;
                break;
            }
        }
        // if flag equals 1 then we update existing data
        if(!flag){
            printf("\n\nData is not found..\n");
        }else{
            printf("Press 1. name.\n");
            printf("Press 2. Date of birth.\n");
            printf("Press 3. City.\n");
            printf("Press 4. Department.\n");
            printf("Press 5. Program.\n");
            printf("Enter your choice no :-  ");
            scanf("%d", &option);
            fflush(stdin);
            switch(option){

                case 1:
                    printf("\nEnter new Name :-  ");
                    gets((std + i)->name);
                    break;

                case 2:
                    printf("\nEnter data of birth :-  ");
                    gets((std + i)->dob);
                    break;

                case 3:
                    printf("\nEnter City :-  ");
                    gets((std + i)->city);
                    break;

                case 4:
                    top:
                        printf("\nDepartments (Computer, Science):-\n");
                        printf("Press 1 for Computer department.\n");
                        printf("Press 2 for Science department.\n");
                        printf("Enter your choice no :-  ");
                        scanf("%d", &option);
                        switch(option){
                            case 1:
                               strcpy((std + i)->dept, "Computer");
                               break;
                            case 2:
                               strcpy((std + i)->dept, "Science");
                               break;
                            default :
                                // If user input invalid choice then it again goto top
                                printf("Invalid Input (^.^).");
                                goto top;
                        }
                      break;
                   case 5:
                        top1:
                            printf("\nPrograms (BSCS,BSS, BSSE) \n");
                            printf("Press 1 for BSCS.\n");
                            printf("Press 2 for BSS.\n");
                            printf("Press 3 for BSSE.\n");
                            printf("Enter your choice no :-  ");
                            scanf("%d", &option);
                            switch(option){
                                case 1:
                                  strcpy((std + i)-> program, "BSCS");
                                  break;
                                case 2:
                                  strcpy((std + i)-> program, "BSS");
                                  break;
                                case 3:
                                  strcpy((std + i)-> program, "BSSE");
                                  break;
                                default:
                                    printf("Invalid Input (^.^).");
                                    goto top1;
                            }
                        break;
                   case 6:
                        printf("\nEnter 5 subjects marks \n");
                        int j, temp;
                        for(j = 0; j < 5; j++){
                          loop:
                          printf("Enter %d subject marks :-  ", (i+ 1));
                          scanf("%d", &temp);
                          if(temp <= 100 && temp >= 0)
                               (std + i)->subjects[j] = temp;
                          else{
                               printf("\nInvalid marks number. Please enter correct marks number (0 - 100)\n");
                               goto loop;
                          }
                         }
                        break;

            }
        }
   }


  // Main function
  int main(){
    student *students;
    int size = 0;
    students  =  malloc(5 * sizeof(student));

     int option;
     do{
           printf("\nPress 1. Add New Student.");
           printf("\nPress 2. Remove Existing Student.");
           printf("\nPress 3. Search Student (one OR more) by Department.");
           printf("\nPress 4. Search Student (one OR more) by City.");
           printf("\nPress 5. Search Student (one OR more) by Program.");
           printf("\nPress 6. Update Existing Student.");
           printf("\nPress 7. Find Total Number of Students of Specific Department.");
           printf("\nPress 8. Find Average Result of Specific Department.");
           printf("\nPress 9. Search Specific Student by Reg No. and Find whether He is Pass OR Fail.");
           printf("\nPress 10. Find the grade each subject of the student by registration No.");
           printf("\nPress 11. show all student details.");
           printf("\nPress 12. Exit.\n\n");
           printf("Enter your choice number :- ");
           scanf("%d", &option);

           switch(option){
               case 1: addStudentDetails(students, &size);
                    break;
               case 2: removeStudentDetails(students, &size);
                    break;
               case 3: searchStudentDetailsByDepartment(students, size);
                    break;
               case 4: searchStudentDetailsByCity(students, size);
                    break;
               case 5: searchStudentDetailsByProgram(students, size);
                    break;
               case 6: updateStudentDetails(students, size);
                    break;
               case 7: findNumberofStudentDepartment(students, size);
                    break;
               case 8: averageResult(students, size);
                    break;
               case 9: searchStudentByRegNo(students, size);
                    break;
               case 10: findGrade(students, size);
                    break;
               case 11: showStudentData(students, size);
                    break;
               case 12:
                    printf("\n\n\n \t\t\t (^.^) End. (^.^) \n\n\n\n");
                    exit(0);
               default:
                    printf("\n\n\nInvalid Input. (^.^) \n\\n\n");
           }
        }while(1); // If user press 11 number to exit from application

//
//
//    students->reg_no = 10;
//    strcpy(students->name, "om Prakash kumar");
//    strcpy(students->dob, "23-12-2000");
//    strcpy(students->city, "Mahwal");
//    strcpy(students->dept, "Science");
//    strcpy(students->program, "BSCS");
//
//    students->subjects[0] = 78;
//    students->subjects[1] = 79;
//    students->subjects[2] = 48;
//    students->subjects[3] = 88;
//    students->subjects[4] = 98;
//
//    (students + 1)->reg_no = 1090;
//    strcpy((students + 1)->name, "Rahul kumar");
//    strcpy((students + 1)->dob, "23-12-2000");
//    strcpy((students + 1)->city, "Halimpur");
//    strcpy((students + 1)->dept, "Computer");
//    strcpy((students + 1)->program, "BSCS");
//
//    (students + 1)->subjects[0] = 78;
//    (students + 1)->subjects[1] = 79;
//    (students + 1)->subjects[2] = 48;
//    (students + 1)->subjects[3] = 88;
//    (students + 1)->subjects[4] = 98;
//
//     (students + 2)->reg_no = 1090;
//    strcpy((students + 2)->name, "Rahul kumar");
//    strcpy((students + 2)->dob, "23-12-2000");
//    strcpy((students + 2)->city, "Halimpur");
//    strcpy((students + 2)->dept, "Computer");
//    strcpy((students + 2)->program, "BSCS");
//
//    (students + 2)->subjects[0] = 78;
//    (students + 2)->subjects[1] = 79;
//    (students + 2)->subjects[2] = 48;
//    (students + 2)->subjects[3] = 88;
//    (students + 2)->subjects[4] = 98;
//
//     (students + 3)->reg_no = 1233;
//    strcpy((students + 3)->name, "Vikash kumar");
//    strcpy((students + 3)->dob, "23-mar-2000");
//    strcpy((students + 3)->city, "Halimpur");
//    strcpy((students + 3)->dept, "Computer");
//    strcpy((students + 3)->program, "BSCS");
//
//    (students + 3)->subjects[0] = 78;
//    (students + 3)->subjects[1] = 79;
//    (students + 3)->subjects[2] = 48;
//    (students + 3)->subjects[3] = 88;
//    (students + 3)->subjects[4] = 98;
//
//     (students + 4)->reg_no = 1233;
//    strcpy((students + 4)->name, "Prakash kumar");
//    strcpy((students + 4)->dob, "23-12-2000");
//    strcpy((students + 4)->city, "Halimpur");
//    strcpy((students + 4)->dept, "Science");
//    strcpy((students + 4)->program, "BSS");
//
//    (students + 4)->subjects[0] = 78;
//    (students + 4)->subjects[1] = 79;
//    (students + 4)->subjects[2] = 48;
//    (students + 4)->subjects[3] = 88;
//    (students + 4)->subjects[4] = 98;
//
//
//    size = 5;
//
//   // addStudentDetails(students, &size);
//    showStudentData(students, size);

//
//  // removeStudentDetails(students, &size);
//   showStudentData(students, size);
//
//   searchStudentDetailsByDepartment(students, size);
//   searchStudentDetailsByCity(students, size);
//   searchStudentDetailsByProgram(students, size);
//
//
//   findNumberofStudentDepartment(students, size);
//   // average
//   averageResult(students, size);


    return (0);
  }
