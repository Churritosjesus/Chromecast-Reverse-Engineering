.class final Lagj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2261
    .line 4263
    new-instance v0, Lagi;

    .line 5237
    invoke-direct {v0, p1}, Lagi;-><init>(Landroid/os/Parcel;)V

    .line 2261
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2261
    .line 3267
    new-array v0, p1, [Lagi;

    .line 2261
    return-object v0
.end method
