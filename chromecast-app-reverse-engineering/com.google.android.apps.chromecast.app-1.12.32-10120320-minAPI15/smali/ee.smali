.class final Lee;
.super Lei;
.source "PG"


# instance fields
.field private synthetic d:Led;


# direct methods
.method constructor <init>(Led;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lee;->d:Led;

    invoke-direct {p0}, Lei;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lee;->d:Led;

    iget v0, v0, Led;->c:I

    return v0
.end method

.method protected final a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lee;->d:Led;

    invoke-virtual {v0, p1}, Led;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected final a(II)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lee;->d:Led;

    iget-object v0, v0, Led;->b:[Ljava/lang/Object;

    shl-int/lit8 v1, p1, 0x1

    add-int/2addr v1, p2

    aget-object v0, v0, v1

    return-object v0
.end method

.method protected final a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lee;->d:Led;

    invoke-virtual {v0, p1, p2}, Led;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final a(I)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lee;->d:Led;

    invoke-virtual {v0, p1}, Led;->d(I)Ljava/lang/Object;

    .line 112
    return-void
.end method

.method protected final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lee;->d:Led;

    invoke-virtual {v0, p1, p2}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    return-void
.end method

.method protected final b(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lee;->d:Led;

    invoke-virtual {v0, p1}, Led;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected final b()Ljava/util/Map;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lee;->d:Led;

    return-object v0
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lee;->d:Led;

    invoke-virtual {v0}, Led;->clear()V

    .line 117
    return-void
.end method
