.class final Lya;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field a:I

.field b:I

.field c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 2070
    new-instance v0, Lyb;

    invoke-direct {v0}, Lyb;-><init>()V

    sput-object v0, Lya;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 2034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2036
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2038
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2039
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lya;->a:I

    .line 2040
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lya;->b:I

    .line 2041
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lya;->c:Z

    .line 2042
    return-void

    .line 2041
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lya;)V
    .locals 1

    .prologue
    .line 2044
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2045
    iget v0, p1, Lya;->a:I

    iput v0, p0, Lya;->a:I

    .line 2046
    iget v0, p1, Lya;->b:I

    iput v0, p0, Lya;->b:I

    .line 2047
    iget-boolean v0, p1, Lya;->c:Z

    iput-boolean v0, p0, Lya;->c:Z

    .line 2048
    return-void
.end method


# virtual methods
.method final a()Z
    .locals 1

    .prologue
    .line 2051
    iget v0, p0, Lya;->a:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final describeContents()I
    .locals 1

    .prologue
    .line 2060
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 2065
    iget v0, p0, Lya;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 2066
    iget v0, p0, Lya;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 2067
    iget-boolean v0, p0, Lya;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 2068
    return-void

    .line 2067
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
