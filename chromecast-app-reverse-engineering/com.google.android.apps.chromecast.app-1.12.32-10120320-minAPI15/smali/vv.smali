.class final Lvv;
.super Lqn;
.source "PG"


# instance fields
.field private synthetic g:Lvu;


# direct methods
.method public constructor <init>(Lvu;Landroid/content/Context;Lqu;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 690
    iput-object p1, p0, Lvv;->g:Lvu;

    .line 691
    const/4 v3, 0x0

    sget v5, La;->s:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;ZI)V

    .line 695
    invoke-virtual {p3}, Lqu;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Lqe;

    .line 696
    invoke-virtual {v0}, Lqe;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1053
    iget-object v0, p1, Lvu;->f:Landroid/view/View;

    .line 698
    if-nez v0, :cond_2

    .line 2053
    iget-object v0, p1, Lvu;->e:Lqr;

    .line 698
    check-cast v0, Landroid/view/View;

    .line 3113
    :goto_0
    iput-object v0, p0, Lqn;->b:Landroid/view/View;

    .line 701
    :cond_0
    iget-object v0, p1, Lvu;->m:Lwb;

    .line 3267
    iput-object v0, p0, Lqn;->d:Lqq;

    .line 704
    invoke-virtual {p3}, Lqu;->size()I

    move-result v1

    move v0, v4

    .line 705
    :goto_1
    if-ge v0, v1, :cond_1

    .line 706
    invoke-virtual {p3, v0}, Lqu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 707
    invoke-interface {v2}, Landroid/view/MenuItem;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 708
    const/4 v4, 0x1

    .line 4117
    :cond_1
    iput-boolean v4, p0, Lqn;->e:Z

    .line 713
    return-void

    .line 3053
    :cond_2
    iget-object v0, p1, Lvu;->f:Landroid/view/View;

    goto :goto_0

    .line 705
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .prologue
    .line 717
    invoke-super {p0}, Lqn;->onDismiss()V

    .line 718
    iget-object v0, p0, Lvv;->g:Lvu;

    .line 5053
    const/4 v1, 0x0

    iput-object v1, v0, Lvu;->k:Lvv;

    .line 720
    return-void
.end method
