.class final Lath;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Latf;


# direct methods
.method constructor <init>(Latf;)V
    .locals 0

    .prologue
    .line 592
    iput-object p1, p0, Lath;->a:Latf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 596
    :goto_0
    iget-object v0, p0, Lath;->a:Latf;

    .line 1066
    iget-object v0, v0, Latf;->j:Ljava/util/List;

    .line 596
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 597
    iget-object v0, p0, Lath;->a:Latf;

    .line 2066
    iget-object v0, v0, Latf;->j:Ljava/util/List;

    .line 597
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ladz;

    invoke-interface {v0, p1}, Ladz;->a(Laef;)V

    goto :goto_0

    .line 599
    :cond_0
    iget-object v0, p0, Lath;->a:Latf;

    .line 3066
    iget-object v0, v0, Latf;->i:Ljava/util/List;

    .line 599
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 600
    iget-object v0, p0, Lath;->a:Latf;

    .line 4066
    iput-boolean v1, v0, Latf;->h:Z

    .line 601
    return-void
.end method
