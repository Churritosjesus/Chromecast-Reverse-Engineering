.class public final Lbjp;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lbjn;

.field private b:Lapd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method public static a(J)Lbjp;
    .locals 4

    .prologue
    .line 46
    new-instance v0, Lbjp;

    invoke-direct {v0}, Lbjp;-><init>()V

    .line 47
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 48
    const-string v2, "uptimeMs"

    invoke-virtual {v1, v2, p0, p1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 49
    invoke-virtual {v0, v1}, Lbjp;->f(Landroid/os/Bundle;)V

    .line 50
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 56
    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 56
    const-string v1, "uptimeMs"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 57
    new-instance v2, Lapd;

    const/16 v3, 0x21

    invoke-direct {v2, v3}, Lapd;-><init>(I)V

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v2, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    iget-object v1, p0, Lbjp;->a:Lbjn;

    .line 59
    invoke-interface {v1}, Lbjn;->A()Laph;

    move-result-object v1

    .line 2115
    iput-object v1, v0, Lapd;->h:Laph;

    .line 59
    iput-object v0, p0, Lbjp;->b:Lapd;

    .line 60
    sget v0, La;->gN:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 61
    sget v0, Lf;->aS:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    sget v0, Lf;->aT:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lbjp;->a:Lbjn;

    .line 63
    invoke-interface {v1}, Lbjn;->F()Lbdf;

    move-result-object v1

    .line 2314
    iget-boolean v1, v1, Lbdf;->h:Z

    .line 63
    if-eqz v1, :cond_0

    .line 64
    sget v1, Lb;->bm:I

    .line 62
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 65
    return-object v2

    .line 64
    :cond_0
    sget v1, Lb;->bl:I

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0}, Lj;->a()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lbjp;->a:Lbjn;

    .line 43
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 35
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 36
    check-cast p1, Lbjn;

    iput-object p1, p0, Lbjp;->a:Lbjn;

    .line 37
    return-void
.end method

.method public final h_()V
    .locals 2

    .prologue
    .line 70
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbjp;->b:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 71
    invoke-super {p0}, Lj;->h_()V

    .line 72
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lbjp;->a:Lbjn;

    sget v1, Lbjo;->i:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    .line 77
    return-void
.end method
