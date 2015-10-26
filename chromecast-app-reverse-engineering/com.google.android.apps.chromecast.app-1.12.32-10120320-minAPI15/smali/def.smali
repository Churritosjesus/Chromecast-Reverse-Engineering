.class public final Ldef;
.super Lddk;
.source "PG"


# static fields
.field private static final b:Ldef;


# instance fields
.field private final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    new-instance v0, Ldef;

    invoke-direct {v0}, Ldef;-><init>()V

    .line 15
    sput-object v0, Ldef;->b:Ldef;

    .line 1064
    const/4 v1, 0x0

    iput-boolean v1, v0, Lddk;->a:Z

    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lddk;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldef;->c:Ljava/util/List;

    .line 27
    return-void
.end method

.method constructor <init>(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lddk;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ldef;->c:Ljava/util/List;

    .line 31
    return-void
.end method

.method public static d()Ldef;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Ldef;->b:Ldef;

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Ldef;->c()V

    .line 36
    iget-object v0, p0, Ldef;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 37
    iget v0, p0, Ldef;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ldef;->modCount:I

    .line 38
    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Ldef;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 47
    invoke-virtual {p0}, Ldef;->c()V

    .line 48
    iget-object v0, p0, Ldef;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    .line 49
    iget v1, p0, Ldef;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldef;->modCount:I

    .line 50
    return-object v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 55
    invoke-virtual {p0}, Ldef;->c()V

    .line 56
    iget-object v0, p0, Ldef;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 57
    iget v1, p0, Ldef;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldef;->modCount:I

    .line 58
    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Ldef;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
