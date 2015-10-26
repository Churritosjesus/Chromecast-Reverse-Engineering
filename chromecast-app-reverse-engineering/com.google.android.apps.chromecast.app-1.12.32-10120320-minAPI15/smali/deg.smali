.class final Ldeg;
.super Lddl;
.source "PG"


# static fields
.field private static final b:[I

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 62
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v1, v0

    .line 70
    :goto_0
    if-lez v0, :cond_0

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    add-int/2addr v1, v0

    move v4, v1

    move v1, v0

    move v0, v4

    .line 75
    goto :goto_0

    .line 79
    :cond_0
    const v0, 0x7fffffff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    sput-object v0, Ldeg;->b:[I

    .line 81
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    sget-object v0, Ldeg;->b:[I

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 83
    sget-object v3, Ldeg;->b:[I

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v3, v1

    .line 81
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 85
    :cond_1
    return-void
.end method

.method static synthetic a(Ldeg;)Lddl;
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Ldeg;)Lddl;
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2

    .prologue
    .line 756
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "RopeByteStream instances are not to be serialized directly"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected final a(III)I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 539
    add-int v0, p2, p3

    .line 540
    if-gtz v0, :cond_0

    .line 541
    invoke-virtual {v3, p1, p2, p3}, Lddl;->a(III)I

    move-result v0

    .line 547
    :goto_0
    return v0

    .line 542
    :cond_0
    if-ltz p2, :cond_1

    .line 543
    invoke-virtual {v3, p1, p2, p3}, Lddl;->a(III)I

    move-result v0

    goto :goto_0

    .line 545
    :cond_1
    rsub-int/lit8 v0, p2, 0x0

    .line 546
    invoke-virtual {v3, p1, p2, v0}, Lddl;->a(III)I

    move-result v1

    .line 547
    const/4 v2, 0x0

    sub-int v0, p3, v0

    invoke-virtual {v3, v1, v2, v0}, Lddl;->a(III)I

    move-result v0

    goto :goto_0
.end method

.method public final a()Lddm;
    .locals 1

    .prologue
    .line 765
    new-instance v0, Ldei;

    .line 1768
    invoke-direct {v0, p0}, Ldei;-><init>(Ldeg;)V

    .line 765
    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 242
    const/4 v0, 0x0

    return v0
.end method

.method protected final b([BIII)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 333
    add-int v0, p2, p4

    if-gtz v0, :cond_0

    .line 334
    invoke-virtual {v3, p1, p2, p3, p4}, Lddl;->b([BIII)V

    .line 344
    :goto_0
    return-void

    .line 335
    :cond_0
    if-ltz p2, :cond_1

    .line 336
    invoke-virtual {v3, p1, p2, p3, p4}, Lddl;->b([BIII)V

    goto :goto_0

    .line 339
    :cond_1
    rsub-int/lit8 v0, p2, 0x0

    .line 340
    invoke-virtual {v3, p1, p2, p3, v0}, Lddl;->b([BIII)V

    .line 341
    const/4 v1, 0x0

    add-int v2, p3, v0

    sub-int v0, p4, v0

    invoke-virtual {v3, p1, v1, v2, v0}, Lddl;->b([BIII)V

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 425
    if-ne p1, p0, :cond_1

    .line 437
    :cond_0
    :goto_0
    return v0

    .line 428
    :cond_1
    instance-of v2, p1, Lddl;

    if-nez v2, :cond_2

    move v0, v1

    .line 429
    goto :goto_0

    .line 432
    :cond_2
    check-cast p1, Lddl;

    .line 433
    invoke-virtual {p1}, Lddl;->b()I

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 434
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 519
    iget v0, p0, Ldeg;->c:I

    .line 521
    if-nez v0, :cond_1

    .line 523
    invoke-virtual {p0, v1, v1, v1}, Ldeg;->a(III)I

    move-result v0

    .line 524
    if-nez v0, :cond_0

    .line 525
    const/4 v0, 0x1

    .line 527
    :cond_0
    iput v0, p0, Ldeg;->c:I

    .line 529
    :cond_1
    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Ldeg;->a()Lddm;

    move-result-object v0

    return-object v0
.end method

.method final writeReplace()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 752
    new-instance v0, Lddy;

    invoke-virtual {p0}, Ldeg;->c()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lddy;-><init>([B)V

    return-object v0
.end method
