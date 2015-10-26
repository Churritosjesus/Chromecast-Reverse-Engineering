.class final Lvx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lwa;

.field private synthetic b:Lvu;


# direct methods
.method public constructor <init>(Lvu;Lwa;)V
    .locals 0

    .prologue
    .line 749
    iput-object p1, p0, Lvx;->b:Lvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 750
    iput-object p2, p0, Lvx;->a:Lwa;

    .line 751
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 754
    iget-object v0, p0, Lvx;->b:Lvu;

    .line 1053
    iget-object v0, v0, Lvu;->c:Lqa;

    .line 1818
    iget-object v1, v0, Lqa;->b:Lqb;

    if-eqz v1, :cond_0

    .line 1819
    iget-object v1, v0, Lqa;->b:Lqb;

    invoke-interface {v1, v0}, Lqb;->a(Lqa;)V

    .line 755
    :cond_0
    iget-object v0, p0, Lvx;->b:Lvu;

    .line 2053
    iget-object v0, v0, Lvu;->e:Lqr;

    .line 755
    check-cast v0, Landroid/view/View;

    .line 756
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvx;->a:Lwa;

    invoke-virtual {v0}, Lwa;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 757
    iget-object v0, p0, Lvx;->b:Lvu;

    iget-object v1, p0, Lvx;->a:Lwa;

    .line 3053
    iput-object v1, v0, Lvu;->j:Lwa;

    .line 759
    :cond_1
    iget-object v0, p0, Lvx;->b:Lvu;

    .line 4053
    const/4 v1, 0x0

    iput-object v1, v0, Lvu;->l:Lvx;

    .line 760
    return-void
.end method
