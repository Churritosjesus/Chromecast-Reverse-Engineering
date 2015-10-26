.class public final Lbbj;
.super Li;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 494
    invoke-direct {p0}, Li;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbbj;
    .locals 3

    .prologue
    .line 502
    new-instance v0, Lbbj;

    invoke-direct {v0}, Lbbj;-><init>()V

    .line 503
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 504
    const-string v2, "message"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    const-string v2, "pattern"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const-string v2, "link"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    invoke-virtual {v0, v1}, Lbbj;->f(Landroid/os/Bundle;)V

    .line 508
    return-object v0
.end method


# virtual methods
.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7

    .prologue
    .line 513
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 513
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2612
    iget-object v1, p0, Lj;->y:Lm;

    .line 3559
    iget-object v2, p0, Lj;->m:Landroid/os/Bundle;

    .line 515
    const-string v3, "message"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    .line 4559
    iget-object v5, p0, Lj;->m:Landroid/os/Bundle;

    .line 516
    const-string v6, "pattern"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    .line 5559
    iget-object v5, p0, Lj;->m:Landroid/os/Bundle;

    .line 517
    const-string v6, "link"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 514
    invoke-static {v1, v2, v3}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    const/4 v2, 0x0

    .line 518
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 519
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
