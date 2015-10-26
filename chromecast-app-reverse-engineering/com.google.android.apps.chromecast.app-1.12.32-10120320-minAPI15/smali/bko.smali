.class public final Lbko;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 81
    new-instance v0, Lbkp;

    invoke-direct {v0}, Lbkp;-><init>()V

    sput-object v0, Lbko;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbko;->d:Ljava/lang/String;

    .line 63
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbko;->a:Ljava/lang/String;

    .line 64
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbko;->b:Ljava/lang/String;

    .line 65
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lbko;->c:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public constructor <init>(Laow;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbko;->d:Ljava/lang/String;

    .line 1597
    iget-object v0, p1, Laow;->c:Lbdf;

    .line 2258
    iget-object v0, v0, Lbdf;->c:Ljava/lang/String;

    .line 29
    iput-object v0, p0, Lbko;->a:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Laow;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbko;->b:Ljava/lang/String;

    .line 2597
    iget-object v0, p1, Laow;->c:Lbdf;

    .line 3518
    iget-object v0, v0, Lbdf;->F:Ljava/lang/String;

    .line 31
    iput-object v0, p0, Lbko;->c:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/cast/CastDevice;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4000
    iget-object v0, p1, Lcom/google/android/gms/cast/CastDevice;->e:Ljava/lang/String;

    .line 35
    iput-object v0, p0, Lbko;->d:Ljava/lang/String;

    .line 5000
    iget-object v0, p1, Lcom/google/android/gms/cast/CastDevice;->g:Ljava/lang/String;

    .line 36
    iput-object v0, p0, Lbko;->a:Ljava/lang/String;

    .line 6000
    iget-object v0, p1, Lcom/google/android/gms/cast/CastDevice;->d:Ljava/net/Inet4Address;

    .line 37
    invoke-virtual {v0}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbko;->b:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lbko;->d:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lbko;->a:Ljava/lang/String;

    .line 23
    iput-object p3, p0, Lbko;->b:Ljava/lang/String;

    .line 24
    iput-object p4, p0, Lbko;->c:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lbko;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lbko;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lbko;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lbko;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 79
    return-void
.end method
