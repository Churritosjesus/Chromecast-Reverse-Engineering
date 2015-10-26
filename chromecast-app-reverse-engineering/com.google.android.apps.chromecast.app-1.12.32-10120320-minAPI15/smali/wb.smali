.class final Lwb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqq;


# instance fields
.field private synthetic a:Lvu;


# direct methods
.method constructor <init>(Lvu;)V
    .locals 0

    .prologue
    .line 723
    iput-object p1, p0, Lwb;->a:Lvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;Z)V
    .locals 2

    .prologue
    .line 736
    instance-of v0, p1, Lqu;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 737
    check-cast v0, Lqu;

    .line 2079
    iget-object v0, v0, Lqu;->k:Lqa;

    .line 737
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqa;->a(Z)V

    .line 739
    :cond_0
    iget-object v0, p0, Lwb;->a:Lvu;

    .line 2152
    iget-object v0, v0, Lpv;->d:Lqq;

    .line 740
    if-eqz v0, :cond_1

    .line 741
    invoke-interface {v0, p1, p2}, Lqq;->a(Lqa;Z)V

    .line 743
    :cond_1
    return-void
.end method

.method public final a_(Lqa;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 727
    if-nez p1, :cond_0

    move v0, v1

    .line 731
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 729
    check-cast v0, Lqu;

    invoke-virtual {v0}, Lqu;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    .line 730
    iget-object v0, p0, Lwb;->a:Lvu;

    .line 1152
    iget-object v0, v0, Lpv;->d:Lqq;

    .line 731
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lqq;->a_(Lqa;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method
