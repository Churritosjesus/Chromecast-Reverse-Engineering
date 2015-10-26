.class public final Ldie;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ldke;

.field public static final b:Ldke;

.field public static final c:Ldke;

.field public static final d:Ldke;

.field public static final e:Ldke;

.field public static final f:Ldke;

.field public static final g:Ldke;


# instance fields
.field public final h:Ldke;

.field public final i:Ldke;

.field final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    const-string v0, ":status"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->a:Ldke;

    .line 9
    const-string v0, ":method"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->b:Ldke;

    .line 10
    const-string v0, ":path"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->c:Ldke;

    .line 11
    const-string v0, ":scheme"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->d:Ldke;

    .line 12
    const-string v0, ":authority"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->e:Ldke;

    .line 13
    const-string v0, ":host"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->f:Ldke;

    .line 14
    const-string v0, ":version"

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    sput-object v0, Ldie;->g:Ldke;

    return-void
.end method

.method public constructor <init>(Ldke;Ldke;)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ldie;->h:Ldke;

    .line 33
    iput-object p2, p0, Ldie;->i:Ldke;

    .line 1281
    iget-object v0, p1, Ldke;->b:[B

    array-length v0, v0

    .line 34
    add-int/lit8 v0, v0, 0x20

    .line 2281
    iget-object v1, p2, Ldke;->b:[B

    array-length v1, v1

    .line 34
    add-int/2addr v0, v1

    iput v0, p0, Ldie;->j:I

    .line 35
    return-void
.end method

.method public constructor <init>(Ldke;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 28
    invoke-static {p2}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldie;-><init>(Ldke;Ldke;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 24
    invoke-static {p1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v0

    invoke-static {p2}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ldie;-><init>(Ldke;Ldke;)V

    .line 25
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 38
    instance-of v1, p1, Ldie;

    if-eqz v1, :cond_0

    .line 39
    check-cast p1, Ldie;

    .line 40
    iget-object v1, p0, Ldie;->h:Ldke;

    iget-object v2, p1, Ldie;->h:Ldke;

    invoke-virtual {v1, v2}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ldie;->i:Ldke;

    iget-object v2, p1, Ldie;->i:Ldke;

    .line 41
    invoke-virtual {v1, v2}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 43
    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Ldie;->h:Ldke;

    invoke-virtual {v0}, Ldke;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    .line 49
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldie;->i:Ldke;

    invoke-virtual {v1}, Ldke;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 50
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 54
    const-string v0, "%s: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ldie;->h:Ldke;

    invoke-virtual {v3}, Ldke;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Ldie;->i:Ldke;

    invoke-virtual {v3}, Ldke;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
