.class final Lasd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lasb;


# direct methods
.method constructor <init>(Lasb;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lasd;->a:Lasb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 59
    iget-object v0, p0, Lasd;->a:Lasb;

    .line 1151
    const/4 v1, 0x1

    iput-boolean v1, v0, Lasb;->e:Z

    .line 1152
    const/4 v1, 0x0

    iput-object v1, v0, Lasb;->f:Ljava/lang/Long;

    .line 1153
    iget-object v1, v0, Lasb;->b:Latz;

    iget-object v2, v0, Lasb;->d:Latf;

    new-instance v3, Lase;

    invoke-direct {v3, v0}, Lase;-><init>(Lasb;)V

    invoke-virtual {v1, v2, v3}, Latz;->b(Latf;Lauo;)V

    .line 60
    return-void
.end method
