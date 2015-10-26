.class public Lcom/facebook/FacebookActivity;
.super Lm;
.source "PG"


# static fields
.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;


# instance fields
.field private g:Lj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-string v0, "PassThrough"

    sput-object v0, Lcom/facebook/FacebookActivity;->e:Ljava/lang/String;

    .line 51
    const-string v0, "SingleFragment"

    sput-object v0, Lcom/facebook/FacebookActivity;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lm;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 90
    invoke-super {p0, p1}, Lm;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 92
    iget-object v0, p0, Lcom/facebook/FacebookActivity;->g:Lj;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/facebook/FacebookActivity;->g:Lj;

    invoke-virtual {v0, p1}, Lj;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 95
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 57
    invoke-super {p0, p1}, Lm;->onCreate(Landroid/os/Bundle;)V

    .line 58
    sget v0, La;->cY:I

    invoke-virtual {p0, v0}, Lcom/facebook/FacebookActivity;->setContentView(I)V

    .line 60
    invoke-virtual {p0}, Lcom/facebook/FacebookActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 61
    sget-object v0, Lcom/facebook/FacebookActivity;->e:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1098
    invoke-virtual {p0}, Lcom/facebook/FacebookActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 1101
    invoke-static {v0}, Laix;->a(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v1

    .line 1102
    invoke-static {v1}, Laix;->a(Landroid/os/Bundle;)Lafq;

    move-result-object v1

    .line 1105
    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Laix;->a(Landroid/content/Intent;Landroid/os/Bundle;Lafq;)Landroid/content/Intent;

    move-result-object v0

    .line 1110
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/FacebookActivity;->setResult(ILandroid/content/Intent;)V

    .line 1111
    invoke-virtual {p0}, Lcom/facebook/FacebookActivity;->finish()V

    .line 86
    :goto_0
    return-void

    .line 1808
    :cond_0
    iget-object v2, p0, Lm;->b:Lt;

    .line 67
    sget-object v0, Lcom/facebook/FacebookActivity;->f:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 69
    if-nez v0, :cond_1

    .line 70
    const-string v0, "FacebookDialogFragment"

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    new-instance v0, Lain;

    invoke-direct {v0}, Lain;-><init>()V

    .line 72
    invoke-virtual {v0, v3}, Lain;->c(Z)V

    .line 73
    sget-object v1, Lcom/facebook/FacebookActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lain;->a(Lr;Ljava/lang/String;)V

    .line 85
    :cond_1
    :goto_1
    iput-object v0, p0, Lcom/facebook/FacebookActivity;->g:Lj;

    goto :goto_0

    .line 77
    :cond_2
    new-instance v0, Lakq;

    invoke-direct {v0}, Lakq;-><init>()V

    .line 78
    invoke-virtual {v0, v3}, Lj;->c(Z)V

    .line 79
    invoke-virtual {v2}, Lr;->a()Laf;

    move-result-object v1

    sget v2, La;->cW:I

    sget-object v3, Lcom/facebook/FacebookActivity;->f:Ljava/lang/String;

    .line 80
    invoke-virtual {v1, v2, v0, v3}, Laf;->a(ILj;Ljava/lang/String;)Laf;

    move-result-object v1

    .line 81
    invoke-virtual {v1}, Laf;->b()I

    goto :goto_1
.end method
