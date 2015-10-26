.class public final Lazl;
.super Ljava/util/TimerTask;
.source "PG"


# instance fields
.field private synthetic a:Lazj;


# direct methods
.method public constructor <init>(Lazj;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lazl;->a:Lazj;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 53
    iget-object v0, p0, Lazl;->a:Lazj;

    .line 1019
    iget-object v0, v0, Lazj;->b:Lbdm;

    .line 53
    iget-object v1, p0, Lazl;->a:Lazj;

    .line 2019
    iget-object v1, v1, Lazj;->c:Lbdn;

    .line 53
    invoke-virtual {v0, v1}, Lbdm;->b(Lbdn;)V

    .line 54
    return-void
.end method
