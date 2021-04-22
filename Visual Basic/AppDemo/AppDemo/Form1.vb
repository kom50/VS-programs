Public Class Form1

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        '''MsgBox("Hello Visual Basic")

    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim n, f, i As Long
        f = 1
        n = Val(InputBox("Enter a number : "))
        For i = 1 To n
            f = f * i
        Next
        MsgBox("Factorial : " & f)


    End Sub

    Private Sub Button1_Enter(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button1.Enter
        Button1.BackColor = Color.Cyan

    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
    End Sub

    Private Sub Button2_Enter(ByVal sender As Object, ByVal e As System.EventArgs) Handles Button2.Enter
        Button2.BackColor = Color.Coral

    End Sub
End Class
