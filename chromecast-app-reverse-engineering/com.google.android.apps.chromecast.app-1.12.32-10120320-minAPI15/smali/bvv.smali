.class public final Lbvv;
.super Li;


# instance fields
.field private Z:Landroid/app/Dialog;

.field private aa:Landroid/content/DialogInterface$OnCancelListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Li;-><init>()V

    iput-object v0, p0, Lbvv;->Z:Landroid/app/Dialog;

    iput-object v0, p0, Lbvv;->aa:Landroid/content/DialogInterface$OnCancelListener;

    return-void
.end method

.method public static a(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Lbvv;
    .locals 3

    const/4 v2, 0x0

    new-instance v1, Lbvv;

    invoke-direct {v1}, Lbvv;-><init>()V

    const-string v0, "Cannot display null dialog"

    invoke-static {p0, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Dialog;

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-object v0, v1, Lbvv;->Z:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    iput-object p1, v1, Lbvv;->aa:Landroid/content/DialogInterface$OnCancelListener;

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final a(Lr;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Li;->a(Lr;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lbvv;->Z:Landroid/app/Dialog;

    if-nez v0, :cond_0

    .line 1254
    const/4 v0, 0x0

    iput-boolean v0, p0, Li;->c:Z

    .line 0
    :cond_0
    iget-object v0, p0, Lbvv;->Z:Landroid/app/Dialog;

    return-object v0
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lbvv;->aa:Landroid/content/DialogInterface$OnCancelListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbvv;->aa:Landroid/content/DialogInterface$OnCancelListener;

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
