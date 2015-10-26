.class public final Lbjs;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lj;-><init>()V

    .line 25
    return-void
.end method

.method public static a(IIZ)Lbjs;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Lbjs;

    invoke-direct {v0}, Lbjs;-><init>()V

    .line 41
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    const-string v2, "headerText"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 43
    const-string v2, "descriptionText"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 44
    const-string v2, "showTroubleshoot"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 45
    invoke-virtual {v0, v1}, Lbjs;->f(Landroid/os/Bundle;)V

    .line 46
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 52
    sget v0, La;->gt:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 1559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 55
    sget v0, Lf;->bo:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v3, "headerText"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 56
    sget v0, Lf;->aq:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 57
    const-string v3, "descriptionText"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 59
    new-instance v3, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {v3}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 61
    sget v0, Lf;->aR:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 62
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    const-string v3, "showTroubleshoot"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 64
    sget v1, Lb;->cA:I

    .line 63
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 67
    invoke-static {v0}, Lblx;->g(Landroid/app/Activity;)V

    .line 69
    return-object v2

    .line 64
    :cond_0
    sget v1, Lb;->cr:I

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 74
    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 74
    const-string v1, "showTroubleshoot"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 75
    check-cast v0, Lbjt;

    invoke-interface {v0}, Lbjt;->m()V

    .line 79
    :goto_0
    return-void

    .line 3612
    :cond_0
    iget-object v0, p0, Lj;->y:Lm;

    .line 77
    check-cast v0, Lbjt;

    invoke-interface {v0}, Lbjt;->l()V

    goto :goto_0
.end method
