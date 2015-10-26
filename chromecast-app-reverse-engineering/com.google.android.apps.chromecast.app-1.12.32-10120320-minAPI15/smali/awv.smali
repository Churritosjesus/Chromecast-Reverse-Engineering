.class final Lawv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lawr;


# direct methods
.method constructor <init>(Lawr;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lawv;->a:Lawr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lawv;->a:Lawr;

    .line 1741
    iget-boolean v0, v0, Lj;->s:Z

    .line 215
    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lawv;->a:Lawr;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 216
    check-cast v0, Laov;

    invoke-interface {v0}, Laov;->j()V

    .line 218
    :cond_0
    return-void
.end method
