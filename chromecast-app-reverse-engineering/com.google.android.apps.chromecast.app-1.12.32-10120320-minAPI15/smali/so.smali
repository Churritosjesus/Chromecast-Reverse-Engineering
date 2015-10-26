.class final Lso;
.super Landroid/widget/BaseAdapter;
.source "PG"


# instance fields
.field private synthetic a:Lsm;


# direct methods
.method constructor <init>(Lsm;)V
    .locals 0

    .prologue
    .line 538
    iput-object p1, p0, Lso;->a:Lsm;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 541
    iget-object v0, p0, Lso;->a:Lsm;

    invoke-static {v0}, Lsm;->a(Lsm;)Lxu;

    move-result-object v0

    invoke-virtual {v0}, Lxu;->getChildCount()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 546
    iget-object v0, p0, Lso;->a:Lsm;

    invoke-static {v0}, Lsm;->a(Lsm;)Lxu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lsq;

    .line 1534
    iget-object v0, v0, Lsq;->a:Lml;

    .line 546
    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 551
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 556
    if-nez p2, :cond_0

    .line 557
    iget-object v1, p0, Lso;->a:Lsm;

    invoke-virtual {p0, p1}, Lso;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lml;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lsm;->a(Lsm;Lml;Z)Lsq;

    move-result-object p2

    .line 561
    :goto_0
    return-object p2

    :cond_0
    move-object v0, p2

    .line 559
    check-cast v0, Lsq;

    invoke-virtual {p0, p1}, Lso;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lml;

    .line 2399
    iput-object v1, v0, Lsq;->a:Lml;

    .line 2400
    invoke-virtual {v0}, Lsq;->a()V

    goto :goto_0
.end method
