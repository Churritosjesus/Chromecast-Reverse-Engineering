.class final Lbmj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field final synthetic a:Lbmi;


# direct methods
.method constructor <init>(Lbmi;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lbmj;->a:Lbmi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Lbmj;->a:Lbmi;

    invoke-static {v0}, Lbmi;->a(Lbmi;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lbmj;->a:Lbmi;

    invoke-virtual {v0}, Lbmi;->p()V

    .line 104
    :goto_0
    iget-object v0, p0, Lbmj;->a:Lbmi;

    invoke-static {v0}, Lbmi;->b(Lbmi;)Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    .line 105
    new-instance v1, Lbmk;

    invoke-direct {v1, p0}, Lbmk;-><init>(Lbmj;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lbmj;->a:Lbmi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbmi;->a(Lbmi;Z)V

    .line 101
    iget-object v0, p0, Lbmj;->a:Lbmi;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lbmi;->a(Lbmi;I)V

    goto :goto_0
.end method
