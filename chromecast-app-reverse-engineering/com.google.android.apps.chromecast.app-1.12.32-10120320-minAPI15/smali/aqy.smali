.class public final Laqy;
.super Li;
.source "PG"


# instance fields
.field public Z:Larc;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Li;-><init>()V

    .line 20
    return-void
.end method

.method static synthetic a(Laqy;)Larc;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Laqy;->Z:Larc;

    return-object v0
.end method

.method public static p()Laqy;
    .locals 1

    .prologue
    .line 31
    new-instance v0, Laqy;

    invoke-direct {v0}, Laqy;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 36
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 36
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->Y:I

    .line 37
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->X:I

    .line 38
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->P:I

    new-instance v2, Laqz;

    invoke-direct {v2, p0}, Laqz;-><init>(Laqy;)V

    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 48
    new-instance v1, Lara;

    invoke-direct {v1, p0}, Lara;-><init>(Laqy;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 59
    sget v1, Lb;->ab:I

    new-instance v2, Larb;

    invoke-direct {v2, p0}, Larb;-><init>(Laqy;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 66
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 67
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 68
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 69
    return-object v0
.end method
