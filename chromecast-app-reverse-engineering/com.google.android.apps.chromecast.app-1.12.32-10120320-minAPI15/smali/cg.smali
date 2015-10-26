.class final Lcg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 234
    .line 2237
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 2238
    new-instance v0, Lcf;

    .line 3031
    invoke-direct {v0, p1}, Lcf;-><init>(Landroid/os/Parcel;)V

    .line 2238
    :goto_0
    return-object v0

    .line 3059
    :cond_0
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    .line 2240
    invoke-static {v0}, Lcf;->a(Ljava/lang/Object;)Lcf;

    move-result-object v0

    goto :goto_0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 234
    .line 1246
    new-array v0, p1, [Lcf;

    .line 234
    return-object v0
.end method
