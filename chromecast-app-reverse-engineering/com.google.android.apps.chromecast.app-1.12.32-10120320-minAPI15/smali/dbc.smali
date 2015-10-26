.class public final Ldbc;
.super Ldew;
.source "PG"


# static fields
.field private static volatile e:[Ldbc;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Float;

.field public d:I

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 47
    invoke-direct {p0}, Ldew;-><init>()V

    .line 48
    iput-object v0, p0, Ldbc;->a:Ljava/lang/String;

    .line 49
    iput-object v0, p0, Ldbc;->f:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Ldbc;->b:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Ldbc;->c:Ljava/lang/Float;

    .line 52
    const/high16 v0, -0x80000000

    iput v0, p0, Ldbc;->d:I

    .line 53
    const/4 v0, -0x1

    iput v0, p0, Ldbc;->t:I

    .line 54
    return-void
.end method

.method public static b()[Ldbc;
    .locals 2

    .prologue
    .line 21
    sget-object v0, Ldbc;->e:[Ldbc;

    if-nez v0, :cond_1

    .line 22
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 24
    :try_start_0
    sget-object v0, Ldbc;->e:[Ldbc;

    if-nez v0, :cond_0

    .line 25
    const/4 v0, 0x0

    new-array v0, v0, [Ldbc;

    sput-object v0, Ldbc;->e:[Ldbc;

    .line 27
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :cond_1
    sget-object v0, Ldbc;->e:[Ldbc;

    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 79
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 80
    iget-object v1, p0, Ldbc;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 81
    const/4 v1, 0x1

    iget-object v2, p0, Ldbc;->a:Ljava/lang/String;

    .line 82
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 84
    :cond_0
    iget-object v1, p0, Ldbc;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 85
    const/4 v1, 0x2

    iget-object v2, p0, Ldbc;->f:Ljava/lang/String;

    .line 86
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 88
    :cond_1
    iget-object v1, p0, Ldbc;->b:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 89
    const/4 v1, 0x3

    iget-object v2, p0, Ldbc;->b:Ljava/lang/String;

    .line 90
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 92
    :cond_2
    iget-object v1, p0, Ldbc;->c:Ljava/lang/Float;

    if-eqz v1, :cond_3

    .line 93
    iget-object v1, p0, Ldbc;->c:Ljava/lang/Float;

    .line 94
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 2569
    const/4 v1, 0x4

    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x4

    .line 94
    add-int/2addr v0, v1

    .line 96
    :cond_3
    iget v1, p0, Ldbc;->d:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_4

    .line 97
    const/4 v1, 0x5

    iget v2, p0, Ldbc;->d:I

    .line 98
    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 100
    :cond_4
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 9
    .line 3108
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 3109
    sparse-switch v0, :sswitch_data_0

    .line 3113
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3114
    :sswitch_0
    return-object p0

    .line 3119
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbc;->a:Ljava/lang/String;

    goto :goto_0

    .line 3123
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbc;->f:Ljava/lang/String;

    goto :goto_0

    .line 3127
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbc;->b:Ljava/lang/String;

    goto :goto_0

    .line 3154
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 3131
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Ldbc;->c:Ljava/lang/Float;

    goto :goto_0

    .line 3169
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 3136
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 3139
    :pswitch_0
    iput v0, p0, Ldbc;->d:I

    goto :goto_0

    .line 3109
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x25 -> :sswitch_4
        0x28 -> :sswitch_5
    .end sparse-switch

    .line 3136
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    const/4 v3, 0x5

    const/4 v2, 0x4

    .line 59
    iget-object v0, p0, Ldbc;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 60
    const/4 v0, 0x1

    iget-object v1, p0, Ldbc;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 62
    :cond_0
    iget-object v0, p0, Ldbc;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 63
    const/4 v0, 0x2

    iget-object v1, p0, Ldbc;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 65
    :cond_1
    iget-object v0, p0, Ldbc;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 66
    const/4 v0, 0x3

    iget-object v1, p0, Ldbc;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 68
    :cond_2
    iget-object v0, p0, Ldbc;->c:Ljava/lang/Float;

    if-eqz v0, :cond_4

    .line 69
    iget-object v0, p0, Ldbc;->c:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 1102
    invoke-virtual {p1, v2, v3}, Ldep;->c(II)V

    .line 1257
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    .line 2042
    iget-object v1, p1, Ldep;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    if-ge v1, v2, :cond_3

    .line 2043
    new-instance v0, Ldeq;

    iget-object v1, p1, Ldep;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    iget-object v2, p1, Ldep;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ldeq;-><init>(II)V

    throw v0

    .line 2045
    :cond_3
    iget-object v1, p1, Ldep;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 71
    :cond_4
    iget v0, p0, Ldbc;->d:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_5

    .line 72
    iget v0, p0, Ldbc;->d:I

    invoke-virtual {p1, v3, v0}, Ldep;->a(II)V

    .line 74
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 75
    return-void
.end method
