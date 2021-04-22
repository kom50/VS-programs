//Developed by Programming.OM
// Tic Tac Toe Game
// Modify 20/04/2020
#include<stdio.h>
#include<conio.h>
#include<dos.h>
#include<stdlib.h>
#include<windows.h>
#include<ctype.h>
#include<string.h>
 	int ss=0,fs=0,matchround=1,fstplayer=0,sndplayer=0,drawmatch=0;
    char fstn[15]="Prakash Raj",sndn[15]="Computer";

 	void printboard(int m[][3]); // print Box
 	void players(bool); // input details of players
 	void TicTac(int m[][3],bool,bool); // Main Logic of Game in function written
    void init(int m[][3]); // initialize with 0
	void dashboard(); // Print dashboard
	void Winner();  // For win
	// Given function only for computer position calculate
    char Rand(); // Random number generate number from 1 to 9
    char Rands(int m[][3]); //Return position of computer winner position
    int check(int [],int,int);
    char ComRand(int [][3],char); // return position of user
    char retLast(int [][3]); // Return last position when only one box is empty

    void End(){
    	printf("\n\n\t------- Programming.OM ------");
        printf("\n\n\t------- End Game ------");
        exit(0);
    }
    //Main Function code
	int main()
     {
      int m[3][3];//={111,120,0,120,111,120,111,111,120};
      //printboard(m);
      //dashboard();
      system("title Tic Tac Toe Game");
	  //printf("%c",ComRand(m,'x'));
      char option;
      bool yes=true,op;
      char option1;
      printf("\n\t   %c%c%c%c%c%c%c%c Programming.OM %c%c%c%c%c%c%c%c\n",219,223,220,223,220,223,220,219,219,220,223,220,223,220,223,219);
      printf("\t<<<< WELCOME IN TIC TAC TOE GAME >>>>");
      getch();
      system("cls");
      fst:
        printf("\nPress 1. to play with computer.");
        printf("\nPress 2. to play with friends.");
        printf("\nPress 3. to exit.");
        printf("\nEnter your choice number :- ");
       // scanf("%c",&option1);
        option1 = getche();
	    if(option1 == 49 ||option1 == 50 || option1 == 51 || option1 == 27){
          if(option1 == 49){
            op = true;
            system("cls");
          }
          else if(option1 == 50)
            {
             op = false;
             system("cls");
            }
          else{
            End();
          }
        }
        else{
          system("cls");
          goto fst;
        }
      players(op);
      init(m);
      //dashboard();
      //getch();
      bool fstpari = true;
      while(1)
	  {
      	TicTac(m,fstpari,op);
        init(m);
        do{
      	 printf("\n\n  You want to play Again (Y/N) :- ");
      	 //fflush(stdin);
      	 option = getche();
		 //scanf("%c",&option);
         system("Cls");
       	 if(option=='y'||option=='Y'||option=='N'||option=='n'){
			switch(option)
			 {
			    case 'n':
				case 'N':
				       	dashboard();
				       	Winner();
				        End();
				case 'y':
				case 'Y':
				       fstpari = matchround % 2 == 0 ? true :false;// : true;
				        //fstpari = false;
				        yes=false;
						break;
			    default:yes=true;
						printf("Wrong choice.");
						break;
			   }
			}
		else
		    yes=true;
		}while(yes);
       matchround++;
	  }
    getch();
  }

 /* void printboard1(int m[][3])
     {
		 printf("\n\n      +---------------------+\n");
         printf("      |  Tic Tac Toe Game   |\n");
         printf("      +---------------------+\n");
         printf("\t _________________\n");
         printf("\t|     |     |     |\n");
         printf("\t|  %c  |  %c  |  %c  |\n",toupper(m[0][0]),toupper(m[0][1]),toupper(m[0][2]));
         printf("\t|_____|_____|_____|\n");
         printf("\t|     |     |     |\n");
         printf("\t|  %c  |  %c  |  %c  |\n",toupper(m[1][0]),toupper(m[1][1]),toupper(m[1][2]));
         printf("\t|_____|_____|_____|\n");
         printf("\t|     |     |     |\n");
         printf("\t|  %c  |  %c  |  %c  |\n",toupper(m[2][0]),toupper(m[2][1]),toupper(m[2][2]));
         printf("\t|_____|_____|_____|\n");
     }
     */
     void printboard(int m[][3])
      {
        printf("\n   %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c",201,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,187);
        printf("\n   %c   Tic Tac Toe Game     %c",186,186);
        printf("\n   %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c",200,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,188);

       // printf("\n\n\t Number Puzzle Game\n");
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",201,205,205,205,203,205,205,205,203,205,205,205,187);
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",186,0,toupper(m[0][0]),0,186,0,toupper(m[0][1]),0,186,0,toupper(m[0][2]),0,186);
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",204,205,205,205,206,205,205,205,206,205,205,205,185);
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",186,0,toupper(m[1][0]),0,186,0,toupper(m[1][1]),0,186,0,toupper(m[1][2]),0,186);
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",204,205,205,205,206,205,205,205,206,205,205,205,185);
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",186,0,toupper(m[2][0]),0,186,0,toupper(m[2][1]),0,186,0,toupper(m[2][2]),0,186);
        printf("\n\t %c%c%c%c%c%c%c%c%c%c%c%c%c",200,205,205,205,202,205,205,205,202,205,205,205,188);
		
		dashboard();
      }

    void players(bool user)
     {
        fflush(stdin);
        if(!user)
           {
     	    printf("\n  Enter name of first player:-");
           }
        else{
           printf("\n  Enter your name :-");
           ss = 'o';
          }
          scanf("%s",fstn);
		 // fgets(fstn,15,stdin);
		  fflush(stdin);
          printf("  And symbol:-");
          scanf("%c",&fs);
          if(fs==ss){
          	 again:
              	printf("  Enter different symbol :- ");
                fflush(stdin);
            	scanf("%c",&fs);
            	if(fs == ss)
		       	  goto again;
			}
          if(!user)
          {
          	fflush(stdin);
            printf("  Enter name of second player:-");
          //  fgets(sndn,15,stdin);
            scanf("%s",sndn);
			fflush(stdin);
            printf("  And symbol:-");
            scanf("%c",&ss);
            if(ss == fs){
          	  again1:
              	printf("  Enter different symbol :- ");
                fflush(stdin);
            	scanf("%c",&ss);
            	if(fs == ss)
		       	  goto again1;
			   }
           }
          else{
             strcpy(sndn,"Computer");
             ss = 'o';
          }
        system("cls");
	 }
    void TicTac(int m[][3],bool fst,bool user)
     {
     	bool op=true;
        int s,k,wins=0,full=0;
        char p;
        int com[10],n=0,userp[10],u1=0;
		//k=1;
        if(fst == true)
          {
              k = 0;
            //  printf("\ntrue %d",k);
          }
        else{

          k = 1;
       // printf("\nfalse %d",k);
        }
        // Set Symbol on given position of all users
        while(k<=9)
         {
          printboard(m);
          if(k%2!=0)
          {
          	do
			  {
               Start1:
               printf("\n  %s enter your position :-",fstn);
               fflush(stdin);
			   p=getche();
               if(p>=49&&p<=57){
                  s=fs;
				  op=false;

			  }
			  else
			    op=true;

                int r = check(com,n,p);
                if(r == 0){
                    goto Start1;
                }

                userp[u1] = p;
                u1++;
		    }while(op);
          }
        else
          {
         // if(k == 0)
         //       k = 1;
           if(!user)
            {
          //  Scand user if user input 2
            do
             {
               printf("\n  %s enter your position:-",sndn);
               fflush(stdin);
                p=getche();
                /*Start:
                 if(Rands(m) > 48)
                 {
                     p = Rands(m);
                     printf("\n Rands %c",p);
                 }
                 else if(ComRand(m,fs) > 48)
                    {
                    p = ComRand(m,fs);
                    printf("\n ComRands %c",p);
                    }
                 else{
                    Else:
                     p = Rand();
                     int ret = check(com,n,p);
                     if(ret ==0)
                        goto Else;

                    printf("\nRand %c",p);
                 }


                if(k > 8){
                    p = retLast(m);
                    printf("\nRand %c",p);
                }

                int r = check(userp,u1,p);
                if(r == 0)
                    goto Start;
*/
                //if(ch>48)
                   //p = ch;
               //printf(" %c position: %d",ss,Rand(9));
              // getch();
               //p = rand() % 9 +1;
               if(p>=49&&p<=57)//&&(check(com,n,p-48)))
                {
                 s=ss;
			 	 op=false;
			 	 com[n] = p;
                 n++;
			   }
            else
             op=true;
          }while(op);
         }
        else{
            // For Computer input position
            Start:
                if(Rands(m) > 48)
                 {
                    p = Rands(m);
                  //  printf("\n Rands %c",p);
                 }
                else if(ComRand(m,fs) > 48)
                 {
                    p = ComRand(m,fs);
                   // printf("\n ComRands %c",p);
                 }
                else{
                    Else:
                     p = Rand();
                     int ret = check(com,n,p);
                     if(ret ==0)
                        goto Else;

                 //   printf("\nRand %c",p);
                 }
                if(k == 8){
                    if(Rands(m) == 48||ComRand(m,ss) == 48)
                       {
                           p = retLast(m);
                       //    printf("\nRand last %c",p);
                       }
                }
                int r = check(userp,u1,p);
                if(r == 0)
                    goto Start;
               if(p>=49&&p<=57)
                {
                  s=ss;
                  com[n] = p;
                  n++;
			   }
             }
          }

        //Symbol set on given position
        switch(p)
           {
             case 49:if(m[0][0]==fs||m[0][0]==ss)
					{
					   k--;
					   m[0][0]=m[0][0];
					}
					else{

	                   full++;
					  m[0][0]=s;
				}
                    break;
            case 50:if(m[0][1]==fs||m[0][1]==ss)
					  {
					   k--;
					   m[0][1]=m[0][1];
					}
					else
			         {
	                   full++;
					  m[0][1]=s;
				}
                    break;
            case 51:if(m[0][2]==fs||m[0][2]==ss)
					 {
					   k--;
					   m[0][2]=m[0][2];
					}
					else
			          {
	                   full++;
					  m[0][2]=s;
                    }
                    break;
            case 52:if(m[1][0]==fs||m[1][0]==ss)
					  {
					   k--;
					   m[1][0]=m[1][0];
					}
					else
					  {
	                   full++;
					  m[1][0]=s;
					}
                    break;
            case 53:if(m[1][1]==fs||m[1][1]==ss)
					  {
					   k--;
					   m[1][1]=m[1][1];
					}
					else
					  {
	                   full++;
					  m[1][1]=s;
				}
                    break;
            case 54:if(m[1][2]==fs||m[1][2]==ss)
					 {
					   k--;
					   m[1][2]=m[1][2];
					}
					else
					  {
	                   full++;
					  m[1][2]=s;
				}
                    break;
            case 55:if(m[2][0]==fs||m[2][0]==ss)
					 {
					   k--;
					   m[2][0]=m[2][0];
					}
					else
					  {
	                   full++;
					  m[2][0]=s;
				}
                    break;
            case 56:if(m[2][1]==fs||m[2][1]==ss)
					  {
					   k--;
					   m[2][1]=m[2][1];
					}
					else
					  {
	                   full++;
					  m[2][1]=s;
				}
					  break;
            case 57:if(m[2][2]==fs||m[2][2]==ss)
					 {
					   k--;
					   m[2][2]=m[2][2];
					}
					else
					 {
	                   full++;
					  m[2][2]=s;
					}
                break;
            default:printf("Wrong choice!");
          }
         //winner
        if(m[0][0]==m[1][1]&&m[0][0]==m[2][2])
           {
             if(m[1][1]!=0&&m[0][0]!=0&&m[2][2]!=0)
               wins=m[1][1];
         }
        if(m[0][2]==m[1][1]&&m[0][2]==m[2][0])
             {
             if(m[0][2]!=0&&m[1][1]!=0&&m[2][0]!=0)
               wins=m[1][1];
         }
        if(m[0][0]==m[0][1]&&m[0][0]==m[0][2])
            {
               if(m[0][0]!=0&&m[0][1]!=0&&m[0][2]!=0)
                  wins=m[0][0];
              }
        if(m[0][0]==m[1][0]&&m[0][0]==m[2][0])
            {
               if(m[1][0]!=0&&m[0][0]!=0&&m[2][0]!=0)
                  wins=m[0][0];
        }
        if(m[1][0]==m[1][1]&&m[1][0]==m[1][2])
             {
             if(m[1][1]!=0&&m[1][0]!=0&&m[1][2]!=0)
                  wins=m[1][1];
        }
        if(m[0][1]==m[1][1]&&m[0][1]==m[2][1])
             {
             if(m[1][1]!=0&&m[0][1]!=0&&m[2][1]!=0)
               wins=m[1][1];
        }
        if(m[0][2]==m[1][2]&&m[0][2]==m[2][2])
              {
             if(m[0][2]!=0&&m[1][2]!=0&&m[2][2]!=0)
               wins=m[2][2];
        }
        if(m[2][0]==m[2][1]&&m[2][0]==m[2][2])
              {
             if(m[2][0]!=0&&m[2][1]!=0&&m[2][2]!=0)
               wins=m[2][2];
        }
        // Test for win

        if(wins==fs)
          {
            system("cls");
            printboard(m);
            printf("\n  %s is winner in this round.\n",fstn);
            fstplayer+=1;
           // dashboard();
         return;
        }
        else if(wins==ss)
        {
           system("cls");
           printboard(m);
           printf("\n  %s is winner in this round.\n",sndn);
           sndplayer+=1;
           //dashboard();
         return;
        }
        if(full==9) {
        	system("cls");
            printboard(m);
            printf("\n\tMatch is draw!\n");
            drawmatch++;
            //dashboard();
         return;
        }
        // printboard(m);
        //printf("\nk : %d full : %d",k,full);
        k++;
        system("cls");
       }
	 }
	void init(int m[][3])
	{
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				m[i][j]=0;
			}
		}
	}
	void dashboard()
	 {
	 /*	printf("\n _______________________________________________________________\n");
	 	printf("| Players Name    |  won Match  |  Match rounds  |   Match draw |");
	 	printf("\n|-----------------|-------------|----------------|--------------|");
	 	printf("\n|%10s (%c)   | %8d    |%8d\t |%8d\t|",fstn,fs,fstplayer,matchround,drawmatch);
		printf("\n|-----------------|-------------|----------------|--------------|");
		printf("\n|%10s (%c)   |%8d     |\t\t |\t\t|",sndn,ss,sndplayer);
		printf("\n|---------------------------------------------------------------|");
	 */
	    printf("\n  %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c",201,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,203,205,205,205,205,205,205,205,205,205,205,205,187);
        printf("\n  %c %-10s(%c)  %c%5d      %c",186,fstn,fs,186,fstplayer,186);
        printf("\n  %c %-10s(%c)  %c%5d      %c",186,sndn,ss,186,sndplayer,186);
        printf("\n  %c Match draw     %c%5d      %c",186,186,drawmatch,186);
		printf("\n  %c Match rounds   %c%5d      %c",186,186,matchround,186);
		//system("color 4");
		printf("\n  %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c",200,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,205,202,205,205,205,205,205,205,205,205,205,205,205,188);

	 }
     
	void Winner(){
		if(fstplayer==sndplayer){
		 	printf("\n  All players won equal number of rounds.");
		 }
		else if(fstplayer>sndplayer) {
		 	printf("\n  %s won this match by %d rounds.",fstn,fstplayer-sndplayer);
		 }
		else {
		 	printf("\n  %s won this match by %d rounds.",sndn,sndplayer-fstplayer);
		 }
    }

   // For Computer input Position code
    char Rand(){
        int p = 0;
        p = rand() % 9 + 1;
        return p+48;
    }
    int check(int com[],int n,int p){
       for(int i=0;i<n;i++)
       {
           if(com[i]==p)
             return 0;
       }
       return 1;
    }

    char Rands(int m[][3])
      {
        int pos=0,count=0;
        bool blank = false;
        int r;
        int i;
        //1 rows
        for(i=0;i<3;i++)
        {
            if(m[0][i]=='o')
            {
                count++;
            }
            else if(m[0][i]==0)
               {
                   pos = i + 1;
                   blank = true;
               }
        }
        if(count == 2&&blank){
            //printf("\n1 %c ",pos+48);
            return pos + 48;
        }

        //2 rows
        blank = false;
        for(count=0,pos=0,i=0;i<3;i++)
        {
            if(m[1][i]=='o')
            {
                count++;
            }
            else if(m[1][i]==0)
               {
                   pos = i + 4;
                   blank = true;
               }
        }
        if(count == 2&&blank==true){
             //printf("\n2 %c ",pos+48);
             return pos + 48;
        }

        //3 rows
        blank = false;
        for(count=0,pos=0,i=0;i<3;i++)
        {
            if(m[2][i]=='o')
            {
                count++;
            }
            else if(m[2][i]==0)
               {
                   pos = i + 7;
                   blank = true;
               }
        }
        if(count == 2&&blank){
               // printf("\n3 %c ",pos+48);
            return pos + 48;
        }
        // next

        //1 column
        blank = false;
        r = 1;
        for(count=0,pos=0,i=0;i<3;i++,r+=3)
        {
            if(m[i][0]=='o')
            {
                count++;
            }
            else if(m[i][0]==0)
               {
                   pos =  r;
                   blank = true;
               }
        }
        if(count == 2&&blank){
            return pos + 48;
        }

        //2 column
        blank = false;
        r = 2;
        for(count=0,pos=0,i=0;i<3;i++,r+=3)
        {
            if(m[i][1]=='o')
            {
                count++;
            }
            else if(m[i][1]==0)
               {
                   pos = r;
                   blank = true;
           ////      printf("\n %d in  %c",pos,pos+48);
               }
            //r = r + 3;
     //   printf("\n%d - %c",r,pos+48);
        }
        if(count == 2&&blank){
       ////    printf("\n5 %d %c ",r,pos+48);
            return pos + 48;
        }

        //3 column
        blank = false;
        r = 3;
        for(count=0,pos=0,i=0;i<3;i++,r+=3)
        {
            if(m[i][2]=='o')
            {
                count++;
            }
            else if(m[i][2]==0)
               {
                   pos = r;
                   blank = true;
               }
        }
        if(count == 2&&blank){
            //printf("\n6 %c ",pos+48);
            return pos + 48;
        }

        //diagonal
        blank = false;
        r = 1;
        for(count=0,pos=0,i=0;i<3;i++,r+=4)
        {
            if(m[i][i]=='o')
            {
                count++;
            }
            else if(m[i][i]==0)
               {
                   pos = r;
                   blank = true;

               }
        }
        if(count == 2&&blank){
            //printf("\n7 %c ",pos+48);
            return pos + 48;
        }

        //last
        blank = false;
        int c = 3,j;
        r = 7;
       for(count=0,pos=0,j=0;j<3;j++)
        {
         for(i=0;i<3;i++)
          {
            if(i==2-j){
              if(m[i][j]=='o')
               {
                count++;
               }
               else if(m[i][j]==0)
               {
                   pos = r;
                   blank = true;
                   //printf("\ndiagonal %d %c ",pos,pos+48);
               }
           r = r - 2;
        }
        }
       }
       if(count == 2&&blank){
            return pos + 48;
       }
        return 48;
      }
     char ComRand(int m[][3],char ss)
      {
        int pos=0,count=0;
        bool blank = false;
        int r;
        int i;

        //1 rows
        for(i=0;i<3;i++)
        {
            if(m[0][i]==ss)
            {
                count++;
            }
            else if(m[0][i]==0)
               {
                   pos = i + 1;
                   blank = true;
               }
        }
        if(count == 2&&blank){
            //printf("\n1 %c ",pos+48);
            return pos + 48;
        }

        //2 rows
        blank = false;
        for(count=0,pos=0,i=0;i<3;i++)
        {
            if(m[1][i]==ss)
            {
                count++;
            }
            else if(m[1][i]==0)
               {
                   pos = i + 4;
                   blank = true;
               }
        }
        if(count == 2&&blank==true){
             //printf("\n2 %c ",pos+48);
             return pos + 48;
        }

        //3 rows
        blank = false;
        for(count=0,pos=0,i=0;i<3;i++)
        {
            if(m[2][i]==ss)
            {
                count++;
            }
            else if(m[2][i]==0)
               {
                   pos = i + 7;
                   blank = true;
               }
        }
        if(count == 2&&blank){
               // printf("\n3 %c ",pos+48);
            return pos + 48;
        }
        // next

        //1 column
        blank = false;
        r = 1;
        for(count=0,pos=0,i=0;i<3;i++,r+=3)
        {
            if(m[i][0]==ss)
            {
                count++;
            }
            else if(m[i][0]==0)
               {
                   pos =  r;
                   blank = true;
               }
        }
        if(count == 2&&blank){
            return pos + 48;
        }

        //2 column
        blank = false;
        r = 2;
        for(count=0,pos=0,i=0;i<3;i++,r+=3)
        {
            if(m[i][1]==ss)
            {
                count++;
            }
            else if(m[i][1]==0)
               {
                   pos = r;
                   blank = true;
           ////      printf("\n %d in  %c",pos,pos+48);
               }
            //r = r + 3;
     //   printf("\n%d - %c",r,pos+48);
        }
        if(count == 2&&blank){
       ////    printf("\n5 %d %c ",r,pos+48);
            return pos + 48;
        }

        //3 column
        blank = false;
        r = 3;
        for(count=0,pos=0,i=0;i<3;i++,r+=3)
        {
            if(m[i][2]==ss)
            {
                count++;
            }
            else if(m[i][2]==0)
               {
                   pos = r;
                   blank = true;
               }
        }
        if(count == 2&&blank){
            //printf("\n6 %c ",pos+48);
            return pos + 48;
        }

        //diagonal
        blank = false;
        r = 1;
        for(count=0,pos=0,i=0;i<3;i++,r+=4)
        {
            if(m[i][i]==ss)
            {
                count++;
            }
            else if(m[i][i]==0)
               {
                   pos = r;
                   blank = true;

               }
        }
        if(count == 2&&blank){
            //printf("\n7 %c ",pos+48);
            return pos + 48;
        }

        //last
        blank = false;
        int c = 3,j;
        r = 7;
       for(count=0,pos=0,j=0;j<3;j++)
        {
         for(i=0;i<3;i++)
          {
            if(i==2-j){
              if(m[i][j]==ss)
               {
                count++;
               }
               else if(m[i][j]==0)
               {
                   pos = r;
                   blank = true;
                   //printf("\ndiagonal %d %c ",pos,pos+48);
               }
           r = r - 2;
         }
        }
       }
       if(count == 2&&blank){
            return pos + 48;
       }
     return 48;
    }

    // Return last empty index position
    char retLast(int m[][3])
      {
        int index = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++,index++){
                if(m[i][j]== 0)
                    return index + 48;
            }
        }
      }
