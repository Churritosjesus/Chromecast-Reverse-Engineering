.class final Lbdg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1081
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1081
    .line 3084
    new-instance v0, Lbdf;

    invoke-direct {v0, p1}, Lbdf;-><init>(Landroid/os/Parcel;)V

    .line 1081
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1081
    .line 2089
    new-array v0, p1, [Lbdf;

    .line 1081
    return-object v0
.end method
