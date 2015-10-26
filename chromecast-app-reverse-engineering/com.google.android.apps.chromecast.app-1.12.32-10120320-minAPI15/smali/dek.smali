.class public final Ldek;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:[I

.field private static final b:[Ljava/lang/Object;

.field private static final c:Ldek;


# instance fields
.field private d:I

.field private e:[I

.field private f:[Ljava/lang/Object;

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 21
    new-array v0, v3, [I

    sput-object v0, Ldek;->a:[I

    .line 22
    new-array v0, v3, [Ljava/lang/Object;

    sput-object v0, Ldek;->b:[Ljava/lang/Object;

    .line 24
    new-instance v0, Ldek;

    sget-object v1, Ldek;->a:[I

    sget-object v2, Ldek;->b:[Ljava/lang/Object;

    invoke-direct {v0, v3, v1, v2}, Ldek;-><init>(I[I[Ljava/lang/Object;)V

    sput-object v0, Ldek;->c:Ldek;

    return-void
.end method

.method constructor <init>(I[I[Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    const/4 v0, -0x1

    iput v0, p0, Ldek;->g:I

    .line 82
    iput p1, p0, Ldek;->d:I

    .line 83
    iput-object p2, p0, Ldek;->e:[I

    .line 84
    iput-object p3, p0, Ldek;->f:[Ljava/lang/Object;

    .line 85
    return-void
.end method

.method public static a()Ldek;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Ldek;->c:Ldek;

    return-object v0
.end method

.method static a(Ldek;Ldek;)Ldek;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 50
    iget v0, p0, Ldek;->d:I

    iget v1, p1, Ldek;->d:I

    add-int/2addr v0, v1

    .line 51
    iget-object v1, p0, Ldek;->e:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    .line 52
    iget-object v2, p1, Ldek;->e:[I

    iget v3, p0, Ldek;->d:I

    iget v4, p1, Ldek;->d:I

    invoke-static {v2, v6, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    iget-object v2, p0, Ldek;->f:[Ljava/lang/Object;

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    .line 54
    iget-object v3, p1, Ldek;->f:[Ljava/lang/Object;

    iget v4, p0, Ldek;->d:I

    iget v5, p1, Ldek;->d:I

    invoke-static {v3, v6, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    new-instance v3, Ldek;

    invoke-direct {v3, v0, v1, v2}, Ldek;-><init>(I[I[Ljava/lang/Object;)V

    return-object v3
.end method

.method public static b()Ldel;
    .locals 1

    .prologue
    .line 42
    new-instance v0, Ldel;

    .line 2205
    invoke-direct {v0}, Ldel;-><init>()V

    .line 42
    return-object v0
.end method

.method static synthetic d()[I
    .locals 1

    .prologue
    .line 19
    sget-object v0, Ldek;->a:[I

    return-object v0
.end method

.method static synthetic e()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Ldek;->b:[Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic f()Ldek;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Ldek;->c:Ldek;

    return-object v0
.end method


# virtual methods
.method public final a(Lddo;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 93
    move v1, v2

    :goto_0
    iget v0, p0, Ldek;->d:I

    if-ge v1, v0, :cond_1

    .line 94
    iget-object v0, p0, Ldek;->e:[I

    aget v0, v0, v1

    .line 95
    invoke-static {v0}, Lden;->b(I)I

    move-result v3

    .line 96
    invoke-static {v0}, Lden;->a(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 115
    :pswitch_0
    invoke-static {}, Lddx;->f()Lddx;

    move-result-object v0

    throw v0

    .line 98
    :pswitch_1
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 3163
    invoke-virtual {p1, v3, v2}, Lddo;->d(II)V

    .line 3389
    invoke-virtual {p1, v4, v5}, Lddo;->a(J)V

    .line 93
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 101
    :pswitch_2
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 4191
    const/4 v4, 0x5

    invoke-virtual {p1, v3, v4}, Lddo;->d(II)V

    .line 5352
    and-int/lit16 v3, v0, 0xff

    invoke-virtual {p1, v3}, Lddo;->a(I)V

    .line 5353
    shr-int/lit8 v3, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    invoke-virtual {p1, v3}, Lddo;->a(I)V

    .line 5354
    shr-int/lit8 v3, v0, 0x10

    and-int/lit16 v3, v3, 0xff

    invoke-virtual {p1, v3}, Lddo;->a(I)V

    .line 5355
    ushr-int/lit8 v0, v0, 0x18

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    goto :goto_1

    .line 104
    :pswitch_3
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 6184
    const/4 v0, 0x1

    invoke-virtual {p1, v3, v0}, Lddo;->d(II)V

    .line 7362
    long-to-int v0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7363
    const/16 v0, 0x8

    shr-long v6, v4, v0

    long-to-int v0, v6

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7364
    const/16 v0, 0x10

    shr-long v6, v4, v0

    long-to-int v0, v6

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7365
    const/16 v0, 0x18

    shr-long v6, v4, v0

    long-to-int v0, v6

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7366
    const/16 v0, 0x20

    shr-long v6, v4, v0

    long-to-int v0, v6

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7367
    const/16 v0, 0x28

    shr-long v6, v4, v0

    long-to-int v0, v6

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7368
    const/16 v0, 0x30

    shr-long v6, v4, v0

    long-to-int v0, v6

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    .line 7369
    const/16 v0, 0x38

    shr-long/2addr v4, v0

    long-to-int v0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1, v0}, Lddo;->a(I)V

    goto/16 :goto_1

    .line 107
    :pswitch_4
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Lddl;

    .line 8267
    const/4 v4, 0x2

    invoke-virtual {p1, v3, v4}, Lddo;->d(II)V

    .line 8552
    invoke-virtual {v0}, Lddl;->b()I

    move-result v3

    invoke-virtual {p1, v3}, Lddo;->c(I)V

    .line 9153
    invoke-virtual {v0}, Lddl;->b()I

    move-result v3

    .line 9253
    iget v4, p1, Lddo;->b:I

    iget v5, p1, Lddo;->c:I

    sub-int/2addr v4, v5

    if-lt v4, v3, :cond_0

    .line 9255
    iget-object v4, p1, Lddo;->a:[B

    iget v5, p1, Lddo;->c:I

    invoke-virtual {v0, v4, v2, v5, v3}, Lddl;->a([BIII)V

    .line 9256
    iget v0, p1, Lddo;->c:I

    add-int/2addr v0, v3

    iput v0, p1, Lddo;->c:I

    .line 9279
    iget v0, p1, Lddo;->d:I

    add-int/2addr v0, v3

    iput v0, p1, Lddo;->d:I

    goto/16 :goto_1

    .line 9261
    :cond_0
    iget v1, p1, Lddo;->b:I

    iget v4, p1, Lddo;->c:I

    sub-int/2addr v1, v4

    .line 9262
    iget-object v4, p1, Lddo;->a:[B

    iget v5, p1, Lddo;->c:I

    invoke-virtual {v0, v4, v2, v5, v1}, Lddl;->a([BIII)V

    .line 9263
    add-int/lit8 v0, v1, 0x0

    .line 9264
    sub-int v0, v3, v1

    .line 9265
    iget v0, p1, Lddo;->b:I

    iput v0, p1, Lddo;->c:I

    .line 9266
    iget v0, p1, Lddo;->d:I

    add-int/2addr v0, v1

    iput v0, p1, Lddo;->d:I

    .line 10060
    new-instance v0, Lcml;

    invoke-direct {v0}, Lcml;-><init>()V

    throw v0

    .line 110
    :pswitch_5
    const/4 v0, 0x3

    invoke-virtual {p1, v3, v0}, Lddo;->d(II)V

    .line 111
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ldek;

    invoke-virtual {v0, p1}, Ldek;->a(Lddo;)V

    .line 112
    const/4 v0, 0x4

    invoke-virtual {p1, v3, v0}, Lddo;->d(II)V

    goto/16 :goto_1

    .line 118
    :cond_1
    return-void

    .line 96
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final c()I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 126
    iget v2, p0, Ldek;->g:I

    .line 127
    const/4 v1, -0x1

    if-eq v2, v1, :cond_0

    .line 159
    :goto_0
    return v2

    :cond_0
    move v1, v0

    move v2, v0

    .line 132
    :goto_1
    iget v0, p0, Ldek;->d:I

    if-ge v1, v0, :cond_1

    .line 133
    iget-object v0, p0, Ldek;->e:[I

    aget v0, v0, v1

    .line 134
    invoke-static {v0}, Lden;->b(I)I

    move-result v3

    .line 135
    invoke-static {v0}, Lden;->a(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 153
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lddx;->f()Lddx;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 137
    :pswitch_1
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lddo;->a(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 132
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 140
    :pswitch_2
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v3, v0}, Lddo;->b(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 141
    goto :goto_2

    .line 143
    :pswitch_3
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lddo;->c(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 144
    goto :goto_2

    .line 146
    :pswitch_4
    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Lddl;

    invoke-static {v3, v0}, Lddo;->a(ILddl;)I

    move-result v0

    add-int/2addr v2, v0

    .line 147
    goto :goto_2

    .line 149
    :pswitch_5
    invoke-static {v3}, Lddo;->b(I)I

    move-result v0

    shl-int/lit8 v3, v0, 0x1

    iget-object v0, p0, Ldek;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Ldek;

    .line 150
    invoke-virtual {v0}, Ldek;->c()I

    move-result v0

    add-int/2addr v0, v3

    add-int/2addr v2, v0

    .line 151
    goto :goto_2

    .line 157
    :cond_1
    iput v2, p0, Ldek;->g:I

    goto :goto_0

    .line 135
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 164
    if-ne p0, p1, :cond_1

    .line 184
    :cond_0
    :goto_0
    return v0

    .line 168
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 169
    goto :goto_0

    .line 172
    :cond_2
    instance-of v2, p1, Ldek;

    if-nez v2, :cond_3

    move v0, v1

    .line 173
    goto :goto_0

    .line 176
    :cond_3
    check-cast p1, Ldek;

    .line 177
    iget v2, p0, Ldek;->d:I

    iget v3, p1, Ldek;->d:I

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Ldek;->e:[I

    iget-object v3, p1, Ldek;->e:[I

    .line 179
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Ldek;->f:[Ljava/lang/Object;

    iget-object v3, p1, Ldek;->f:[Ljava/lang/Object;

    .line 180
    invoke-static {v2, v3}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    .line 181
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 191
    iget v0, p0, Ldek;->d:I

    add-int/lit16 v0, v0, 0x20f

    .line 192
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldek;->e:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    .line 193
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldek;->f:[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->deepHashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 195
    return v0
.end method
