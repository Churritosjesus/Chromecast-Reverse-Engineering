.class public final Lavq;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Landroid/os/ParcelUuid;

.field private static b:Landroid/os/ParcelUuid;

.field private static c:Landroid/os/ParcelUuid;

.field private static d:Landroid/os/ParcelUuid;

.field private static e:Landroid/os/ParcelUuid;

.field private static f:Landroid/os/ParcelUuid;

.field private static g:Landroid/os/ParcelUuid;

.field private static h:Landroid/os/ParcelUuid;

.field private static i:Landroid/os/ParcelUuid;

.field private static j:Landroid/os/ParcelUuid;

.field private static k:Landroid/os/ParcelUuid;

.field private static l:Landroid/os/ParcelUuid;

.field private static m:Landroid/os/ParcelUuid;

.field private static n:Landroid/os/ParcelUuid;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 39
    const-string v0, "0000110B-0000-1000-8000-00805F9B34FB"

    .line 40
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->a:Landroid/os/ParcelUuid;

    .line 41
    const-string v0, "0000110A-0000-1000-8000-00805F9B34FB"

    .line 42
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->b:Landroid/os/ParcelUuid;

    .line 43
    const-string v0, "0000110D-0000-1000-8000-00805F9B34FB"

    .line 44
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->c:Landroid/os/ParcelUuid;

    .line 45
    const-string v0, "00001108-0000-1000-8000-00805F9B34FB"

    .line 46
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->d:Landroid/os/ParcelUuid;

    .line 47
    const-string v0, "00001112-0000-1000-8000-00805F9B34FB"

    .line 48
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 49
    const-string v0, "0000111E-0000-1000-8000-00805F9B34FB"

    .line 50
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->e:Landroid/os/ParcelUuid;

    .line 51
    const-string v0, "0000111F-0000-1000-8000-00805F9B34FB"

    .line 52
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 53
    const-string v0, "0000110E-0000-1000-8000-00805F9B34FB"

    .line 54
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->f:Landroid/os/ParcelUuid;

    .line 55
    const-string v0, "0000110C-0000-1000-8000-00805F9B34FB"

    .line 56
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->g:Landroid/os/ParcelUuid;

    .line 57
    const-string v0, "00001105-0000-1000-8000-00805f9b34fb"

    .line 58
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->h:Landroid/os/ParcelUuid;

    .line 59
    const-string v0, "00001124-0000-1000-8000-00805f9b34fb"

    .line 60
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 61
    const-string v0, "00001812-0000-1000-8000-00805f9b34fb"

    .line 62
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 63
    const-string v0, "00001115-0000-1000-8000-00805F9B34FB"

    .line 64
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->i:Landroid/os/ParcelUuid;

    .line 65
    const-string v0, "00001116-0000-1000-8000-00805F9B34FB"

    .line 66
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->j:Landroid/os/ParcelUuid;

    .line 67
    const-string v0, "0000000f-0000-1000-8000-00805F9B34FB"

    .line 68
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 69
    const-string v0, "0000112e-0000-1000-8000-00805F9B34FB"

    .line 70
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 71
    const-string v0, "0000112f-0000-1000-8000-00805F9B34FB"

    .line 72
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    .line 73
    const-string v0, "00001134-0000-1000-8000-00805F9B34FB"

    .line 74
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->k:Landroid/os/ParcelUuid;

    .line 75
    const-string v0, "00001133-0000-1000-8000-00805F9B34FB"

    .line 76
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->l:Landroid/os/ParcelUuid;

    .line 77
    const-string v0, "00001132-0000-1000-8000-00805F9B34FB"

    .line 78
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->m:Landroid/os/ParcelUuid;

    .line 80
    const-string v0, "00000000-0000-1000-8000-00805F9B34FB"

    .line 81
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lavq;->n:Landroid/os/ParcelUuid;

    .line 90
    const/16 v0, 0xd

    new-array v0, v0, [Landroid/os/ParcelUuid;

    const/4 v1, 0x0

    sget-object v2, Lavq;->a:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lavq;->b:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lavq;->c:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lavq;->d:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lavq;->e:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lavq;->f:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lavq;->g:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lavq;->h:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lavq;->i:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lavq;->j:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lavq;->k:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lavq;->l:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lavq;->m:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    return-void
.end method

.method public static a([B)Landroid/os/ParcelUuid;
    .locals 6

    .prologue
    const/16 v3, 0x10

    const/4 v2, 0x1

    const/4 v5, 0x2

    const/4 v4, 0x0

    .line 252
    if-nez p0, :cond_0

    .line 253
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "uuidBytes cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_0
    array-length v0, p0

    .line 256
    if-eq v0, v5, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    if-eq v0, v3, :cond_1

    .line 258
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x26

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "uuidBytes length invalid - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 262
    :cond_1
    if-ne v0, v3, :cond_2

    .line 263
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 264
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v2

    .line 265
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v4

    .line 266
    new-instance v0, Landroid/os/ParcelUuid;

    new-instance v1, Ljava/util/UUID;

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    invoke-direct {v0, v1}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    .line 283
    :goto_0
    return-object v0

    .line 272
    :cond_2
    if-ne v0, v5, :cond_3

    .line 273
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    .line 274
    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 281
    :goto_1
    sget-object v2, Lavq;->n:Landroid/os/ParcelUuid;

    invoke-virtual {v2}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    add-long/2addr v2, v0

    .line 282
    sget-object v0, Lavq;->n:Landroid/os/ParcelUuid;

    invoke-virtual {v0}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v4

    .line 283
    new-instance v0, Landroid/os/ParcelUuid;

    new-instance v1, Ljava/util/UUID;

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    invoke-direct {v0, v1}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    goto :goto_0

    .line 276
    :cond_3
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    .line 277
    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 278
    aget-byte v2, p0, v5

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 279
    const/4 v2, 0x3

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x18

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_1
.end method
