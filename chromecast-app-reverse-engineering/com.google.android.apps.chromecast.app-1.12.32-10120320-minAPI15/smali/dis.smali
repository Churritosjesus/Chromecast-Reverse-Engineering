.class final Ldis;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:I

.field final b:Ldkd;

.field private final c:Ldkj;


# direct methods
.method public constructor <init>(Ldkd;)V
    .locals 3

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ldit;

    invoke-direct {v0, p0, p1}, Ldit;-><init>(Ldis;Ldkv;)V

    .line 65
    new-instance v1, Ldiu;

    invoke-direct {v1, p0}, Ldiu;-><init>(Ldis;)V

    .line 77
    new-instance v2, Ldkj;

    invoke-direct {v2, v0, v1}, Ldkj;-><init>(Ldkv;Ljava/util/zip/Inflater;)V

    iput-object v2, p0, Ldis;->c:Ldkj;

    .line 78
    iget-object v0, p0, Ldis;->c:Ldkj;

    invoke-static {v0}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v0

    iput-object v0, p0, Ldis;->b:Ldkd;

    .line 79
    return-void
.end method

.method private a()Ldke;
    .locals 4

    .prologue
    .line 101
    iget-object v0, p0, Ldis;->b:Ldkd;

    invoke-interface {v0}, Ldkd;->i()I

    move-result v0

    .line 102
    iget-object v1, p0, Ldis;->b:Ldkd;

    int-to-long v2, v0

    invoke-interface {v1, v2, v3}, Ldkd;->c(J)Ldke;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(I)Ljava/util/List;
    .locals 6

    .prologue
    .line 82
    iget v0, p0, Ldis;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Ldis;->a:I

    .line 84
    iget-object v0, p0, Ldis;->b:Ldkd;

    invoke-interface {v0}, Ldkd;->i()I

    move-result v1

    .line 85
    if-gez v1, :cond_0

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "numberOfPairs < 0: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    const/16 v0, 0x400

    if-le v1, v0, :cond_1

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "numberOfPairs > 1024: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_3

    .line 90
    invoke-direct {p0}, Ldis;->a()Ldke;

    move-result-object v3

    invoke-virtual {v3}, Ldke;->c()Ldke;

    move-result-object v3

    .line 91
    invoke-direct {p0}, Ldis;->a()Ldke;

    move-result-object v4

    .line 1281
    iget-object v5, v3, Ldke;->b:[B

    array-length v5, v5

    .line 92
    if-nez v5, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "name.size == 0"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_2
    new-instance v5, Ldie;

    invoke-direct {v5, v3, v4}, Ldie;-><init>(Ldke;Ldke;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2109
    :cond_3
    iget v0, p0, Ldis;->a:I

    if-lez v0, :cond_4

    .line 2110
    iget-object v0, p0, Ldis;->c:Ldkj;

    invoke-virtual {v0}, Ldkj;->b()Z

    .line 2111
    iget v0, p0, Ldis;->a:I

    if-eqz v0, :cond_4

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "compressedLimit > 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldis;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_4
    return-object v2
.end method
