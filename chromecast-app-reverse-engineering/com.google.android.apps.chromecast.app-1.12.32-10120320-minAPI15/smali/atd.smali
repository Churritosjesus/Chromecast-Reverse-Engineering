.class public final Latd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput p1, p0, Latd;->a:I

    .line 25
    iput-object p2, p0, Latd;->b:Ljava/lang/String;

    .line 26
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 30
    move-object v0, p1

    check-cast v0, Latd;

    .line 31
    instance-of v1, p1, Latd;

    if-eqz v1, :cond_0

    iget v1, p0, Latd;->a:I

    iget v2, v0, Latd;->a:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Latd;->b:Ljava/lang/String;

    iget-object v0, v0, Latd;->b:Ljava/lang/String;

    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    const/4 v0, 0x1

    .line 35
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Latd;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Latd;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    ushr-int/lit8 v1, v1, 0x10

    xor-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x1f

    iget v1, p0, Latd;->a:I

    add-int/2addr v0, v1

    return v0
.end method
