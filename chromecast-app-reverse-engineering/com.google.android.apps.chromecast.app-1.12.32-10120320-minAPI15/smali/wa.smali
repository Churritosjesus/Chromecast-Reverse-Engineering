.class final Lwa;
.super Lqn;
.source "PG"


# instance fields
.field private synthetic g:Lvu;


# direct methods
.method public constructor <init>(Lvu;Landroid/content/Context;Lqa;Landroid/view/View;Z)V
    .locals 6

    .prologue
    .line 673
    iput-object p1, p0, Lwa;->g:Lvu;

    .line 674
    const/4 v4, 0x1

    sget v5, La;->s:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lqn;-><init>(Landroid/content/Context;Lqa;Landroid/view/View;ZI)V

    .line 675
    const v0, 0x800005

    .line 1121
    iput v0, p0, Lqn;->f:I

    .line 676
    iget-object v0, p1, Lvu;->m:Lwb;

    .line 1267
    iput-object v0, p0, Lqn;->d:Lqq;

    .line 677
    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .prologue
    .line 681
    invoke-super {p0}, Lqn;->onDismiss()V

    .line 682
    iget-object v0, p0, Lwa;->g:Lvu;

    .line 2053
    iget-object v0, v0, Lvu;->c:Lqa;

    .line 682
    invoke-virtual {v0}, Lqa;->close()V

    .line 683
    iget-object v0, p0, Lwa;->g:Lvu;

    const/4 v1, 0x0

    .line 3053
    iput-object v1, v0, Lvu;->j:Lwa;

    .line 684
    return-void
.end method
