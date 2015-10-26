.class public final Lbjl;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lbjn;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lj;-><init>()V

    .line 63
    return-void
.end method

.method public static a(IJ)Lbjl;
    .locals 3

    .prologue
    .line 29
    new-instance v0, Lbjl;

    invoke-direct {v0}, Lbjl;-><init>()V

    .line 30
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 31
    const-string v2, "devicePosition"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 32
    const-string v2, "scanStart"

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 33
    invoke-virtual {v0, v1}, Lbjl;->f(Landroid/os/Bundle;)V

    .line 34
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v7, 0x1

    const/4 v5, 0x0

    .line 52
    sget v0, La;->fJ:I

    invoke-virtual {p1, v0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 53
    sget v0, Lf;->ab:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 54
    sget-object v2, Lbjm;->a:[I

    iget-object v3, p0, Lbjl;->a:Lbjn;

    invoke-interface {v3}, Lbjn;->F()Lbdf;

    move-result-object v3

    invoke-virtual {v3}, Lbdf;->b()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 62
    sget v2, La;->el:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 66
    :goto_0
    sget v0, Lf;->dZ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    sget v0, Lf;->bj:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->bx:I

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lbjl;->a:Lbjn;

    .line 69
    invoke-interface {v4}, Lbjn;->F()Lbdf;

    move-result-object v4

    .line 1254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 69
    aput-object v4, v3, v5

    .line 68
    invoke-virtual {p0, v2, v3}, Lbjl;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 70
    const-string v2, "devicePosition"

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 71
    const-string v3, "scanStart"

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 72
    invoke-static {}, Lape;->a()Lape;

    move-result-object v3

    new-instance v6, Lapd;

    iget-object v0, p0, Lbjl;->a:Lbjn;

    .line 73
    invoke-interface {v0}, Lbjn;->F()Lbdf;

    move-result-object v0

    .line 3443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 73
    if-eqz v0, :cond_0

    .line 74
    const/16 v0, 0x6a

    .line 75
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v6, v0, v2}, Lapd;-><init>(ILjava/lang/Integer;)V

    .line 76
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    sub-long v4, v8, v4

    invoke-virtual {v6, v4, v5}, Lapd;->b(J)Lapd;

    move-result-object v0

    iget-object v2, p0, Lbjl;->a:Lbjn;

    .line 77
    invoke-interface {v2}, Lbjn;->A()Laph;

    move-result-object v2

    .line 4115
    iput-object v2, v0, Lapd;->h:Laph;

    .line 72
    invoke-virtual {v3, v0}, Lape;->a(Lapd;)V

    .line 78
    invoke-virtual {p0, v7}, Lbjl;->d(Z)V

    .line 79
    return-object v1

    .line 56
    :pswitch_0
    sget v2, La;->en:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 59
    :pswitch_1
    sget v2, La;->em:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 75
    :cond_0
    const/16 v0, 0x10

    goto :goto_1

    .line 54
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 45
    invoke-super {p0}, Lj;->a()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lbjl;->a:Lbjn;

    .line 47
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 39
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 40
    check-cast p1, Lbjn;

    iput-object p1, p0, Lbjl;->a:Lbjn;

    .line 41
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lbjl;->a:Lbjn;

    sget v1, Lbjo;->a:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    .line 85
    return-void
.end method
