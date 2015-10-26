.class final Lbne;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Last;

.field private synthetic b:Lbnd;


# direct methods
.method constructor <init>(Lbnd;Last;)V
    .locals 0

    .prologue
    .line 1110
    iput-object p1, p0, Lbne;->b:Lbnd;

    iput-object p2, p0, Lbne;->a:Last;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    .line 1113
    iget-object v0, p0, Lbne;->b:Lbnd;

    iget-object v0, v0, Lbnd;->a:Lbmu;

    iget-object v1, p0, Lbne;->a:Last;

    .line 2125
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, v0, Lbmu;->h:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v3, v0, Lbmu;->h:Landroid/content/Context;

    sget v4, Lb;->am:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    .line 3074
    iget-object v7, v1, Last;->c:Ljava/lang/String;

    .line 2127
    aput-object v7, v5, v6

    .line 2126
    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    sget v3, Lb;->L:I

    new-instance v4, Lbnf;

    invoke-direct {v4, v0, v1}, Lbnf;-><init>(Lbmu;Last;)V

    .line 2128
    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    const/4 v2, 0x0

    .line 2136
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 2137
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1114
    return-void
.end method
