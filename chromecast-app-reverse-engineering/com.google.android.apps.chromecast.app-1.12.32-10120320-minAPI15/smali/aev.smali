.class final Laev;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Landroid/graphics/Bitmap;

.field b:Laef;

.field final c:Ljava/util/LinkedList;

.field private final d:Lads;


# direct methods
.method public constructor <init>(Laer;Lads;Laex;)V
    .locals 1

    .prologue
    .line 408
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 401
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Laev;->c:Ljava/util/LinkedList;

    .line 409
    iput-object p2, p0, Laev;->d:Lads;

    .line 410
    iget-object v0, p0, Laev;->c:Ljava/util/LinkedList;

    invoke-virtual {v0, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 411
    return-void
.end method


# virtual methods
.method public final a(Laex;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 442
    iget-object v1, p0, Laev;->c:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 443
    iget-object v1, p0, Laev;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 444
    iget-object v1, p0, Laev;->d:Lads;

    .line 1319
    iput-boolean v0, v1, Lads;->g:Z

    .line 447
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
