.class final Lvw;
.super Lpu;
.source "PG"


# instance fields
.field private synthetic a:Lvu;


# direct methods
.method constructor <init>(Lvu;)V
    .locals 0

    .prologue
    .line 763
    iput-object p1, p0, Lvw;->a:Lvu;

    invoke-direct {p0}, Lpu;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lyc;
    .locals 1

    .prologue
    .line 766
    iget-object v0, p0, Lvw;->a:Lvu;

    .line 1053
    iget-object v0, v0, Lvu;->k:Lvv;

    .line 766
    if-eqz v0, :cond_0

    iget-object v0, p0, Lvw;->a:Lvu;

    .line 2053
    iget-object v0, v0, Lvu;->k:Lvv;

    .line 2131
    iget-object v0, v0, Lqn;->c:Lyc;

    .line 766
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
