.class final Laru;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldcj;

.field private synthetic b:Lart;


# direct methods
.method constructor <init>(Lart;Ldcj;)V
    .locals 0

    .prologue
    .line 195
    iput-object p1, p0, Laru;->b:Lart;

    iput-object p2, p0, Laru;->a:Ldcj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Laru;->a:Ldcj;

    iget-object v0, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    .line 199
    iget-object v0, p0, Laru;->b:Lart;

    invoke-static {v0}, Lart;->a(Lart;)Laqw;

    move-result-object v0

    iget-object v1, p0, Laru;->a:Ldcj;

    invoke-interface {v0, v1}, Laqw;->c(Ldcj;)V

    .line 214
    :cond_0
    :goto_0
    return-void

    .line 202
    :cond_1
    iget-object v0, p0, Laru;->a:Ldcj;

    iget-object v0, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    .line 203
    iget-object v0, p0, Laru;->b:Lart;

    invoke-static {v0}, Lart;->a(Lart;)Laqw;

    move-result-object v0

    iget-object v1, p0, Laru;->a:Ldcj;

    invoke-interface {v0, v1}, Laqw;->d(Ldcj;)V

    goto :goto_0

    .line 206
    :cond_2
    iget-object v0, p0, Laru;->a:Ldcj;

    iget-object v0, v0, Ldcj;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 207
    iget-object v0, p0, Laru;->a:Ldcj;

    iget-object v0, v0, Ldcj;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    iget-object v0, p0, Laru;->a:Ldcj;

    iget-object v0, v0, Ldcj;->r:Ljava/lang/String;

    iget-object v1, p0, Laru;->b:Lart;

    .line 209
    invoke-virtual {v1}, Lart;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lasr;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 210
    iget-object v1, p0, Laru;->b:Lart;

    invoke-virtual {v1}, Lart;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
