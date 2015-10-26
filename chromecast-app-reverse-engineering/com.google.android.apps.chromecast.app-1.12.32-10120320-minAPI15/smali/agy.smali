.class final Lagy;
.super Ljava/io/OutputStream;
.source "PG"

# interfaces
.implements Lahb;


# instance fields
.field final a:Ljava/util/Map;

.field b:I

.field private final c:Landroid/os/Handler;

.field private d:Laga;

.field private e:Lahc;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lagy;->a:Ljava/util/Map;

    .line 38
    iput-object p1, p0, Lagy;->c:Landroid/os/Handler;

    .line 39
    return-void
.end method


# virtual methods
.method final a(J)V
    .locals 5

    .prologue
    .line 56
    iget-object v0, p0, Lagy;->e:Lahc;

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Lahc;

    iget-object v1, p0, Lagy;->c:Landroid/os/Handler;

    iget-object v2, p0, Lagy;->d:Laga;

    invoke-direct {v0, v1, v2}, Lahc;-><init>(Landroid/os/Handler;Laga;)V

    iput-object v0, p0, Lagy;->e:Lahc;

    .line 58
    iget-object v0, p0, Lagy;->a:Ljava/util/Map;

    iget-object v1, p0, Lagy;->d:Laga;

    iget-object v2, p0, Lagy;->e:Lahc;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    :cond_0
    iget-object v0, p0, Lagy;->e:Lahc;

    .line 1056
    iget-wide v2, v0, Lahc;->d:J

    add-long/2addr v2, p1

    iput-wide v2, v0, Lahc;->d:J

    .line 62
    iget v0, p0, Lagy;->b:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    long-to-int v0, v0

    iput v0, p0, Lagy;->b:I

    .line 63
    return-void
.end method

.method public final a(Laga;)V
    .locals 1

    .prologue
    .line 42
    iput-object p1, p0, Lagy;->d:Laga;

    .line 43
    if-eqz p1, :cond_0

    .line 44
    iget-object v0, p0, Lagy;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lahc;

    :goto_0
    iput-object v0, p0, Lagy;->e:Lahc;

    .line 45
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final write(I)V
    .locals 2

    .prologue
    .line 77
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lagy;->a(J)V

    .line 78
    return-void
.end method

.method public final write([B)V
    .locals 2

    .prologue
    .line 67
    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lagy;->a(J)V

    .line 68
    return-void
.end method

.method public final write([BII)V
    .locals 2

    .prologue
    .line 72
    int-to-long v0, p3

    invoke-virtual {p0, v0, v1}, Lagy;->a(J)V

    .line 73
    return-void
.end method
