.class final Larv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ldcj;

.field final synthetic b:Lart;

.field private synthetic c:Landroid/widget/CompoundButton;


# direct methods
.method constructor <init>(Lart;Ldcj;Landroid/widget/CompoundButton;)V
    .locals 0

    .prologue
    .line 220
    iput-object p1, p0, Larv;->b:Lart;

    iput-object p2, p0, Larv;->a:Ldcj;

    iput-object p3, p0, Larv;->c:Landroid/widget/CompoundButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 224
    iget-object v2, p0, Larv;->a:Ldcj;

    iget-object v2, v2, Ldcj;->o:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 225
    iget-object v0, p0, Larv;->b:Lart;

    invoke-static {v0}, Lart;->a(Lart;)Laqw;

    move-result-object v0

    iget-object v1, p0, Larv;->a:Ldcj;

    const-string v2, "child"

    invoke-interface {v0, v1, v2}, Laqw;->a(Ldcj;Ljava/lang/String;)V

    .line 271
    :goto_0
    return-void

    .line 228
    :cond_0
    iget-object v2, p0, Larv;->a:Ldcj;

    iget-object v2, v2, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xb

    if-ne v2, v3, :cond_1

    .line 230
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Larv;->b:Lart;

    invoke-virtual {v3}, Lart;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v3, p0, Larv;->b:Lart;

    .line 231
    invoke-virtual {v3}, Lart;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lb;->am:I

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v5, p0, Larv;->b:Lart;

    .line 233
    invoke-static {v5}, Lart;->a(Lart;)Laqw;

    move-result-object v5

    invoke-interface {v5}, Laqw;->D()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v1

    .line 231
    invoke-virtual {v3, v4, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->L:I

    new-instance v2, Larw;

    invoke-direct {v2, p0}, Larw;-><init>(Larv;)V

    .line 234
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    .line 242
    invoke-virtual {v0, v1, v6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 243
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 246
    :cond_1
    iget-object v2, p0, Larv;->a:Ldcj;

    iget-object v2, v2, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_2

    .line 248
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Larv;->b:Lart;

    invoke-virtual {v1}, Lart;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->af:I

    .line 249
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Larv;->a:Ldcj;

    iget-object v1, v1, Ldcj;->g:Ljava/lang/String;

    .line 250
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->ae:I

    new-instance v2, Larx;

    invoke-direct {v2, p0}, Larx;-><init>(Larv;)V

    .line 251
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    .line 259
    invoke-virtual {v0, v1, v6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 260
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 263
    :cond_2
    iget-object v2, p0, Larv;->a:Ldcj;

    iget-object v2, v2, Ldcj;->i:[Ldcj;

    if-eqz v2, :cond_3

    iget-object v2, p0, Larv;->a:Ldcj;

    iget-object v2, v2, Ldcj;->i:[Ldcj;

    array-length v2, v2

    if-lez v2, :cond_3

    iget-object v2, p0, Larv;->a:Ldcj;

    iget-object v2, v2, Ldcj;->j:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 264
    iget-object v0, p0, Larv;->b:Lart;

    iget-object v1, p0, Larv;->a:Ldcj;

    invoke-static {v0, v1}, Lart;->a(Lart;Ldcj;)V

    goto/16 :goto_0

    .line 266
    :cond_3
    iget-object v2, p0, Larv;->b:Lart;

    invoke-static {v2}, Lart;->a(Lart;)Laqw;

    move-result-object v2

    invoke-interface {v2}, Laqw;->h()Lash;

    move-result-object v2

    invoke-virtual {v2}, Lash;->s()Lauq;

    move-result-object v2

    .line 267
    iget-object v3, p0, Larv;->a:Ldcj;

    iget-object v3, v3, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lauq;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 268
    :goto_1
    iget-object v1, p0, Larv;->c:Landroid/widget/CompoundButton;

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 269
    iget-object v1, p0, Larv;->b:Lart;

    iget-object v2, p0, Larv;->a:Ldcj;

    invoke-static {v1, v2, v0}, Lart;->a(Lart;Ldcj;Z)V

    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 267
    goto :goto_1
.end method
